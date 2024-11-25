package service;
import dao.GroupDAO;
import model.Group;

import java.sql.SQLException;
import java.util.List;

public class GroupService {
    private final GroupDAO groupDAO;

    public GroupService() {
        this.groupDAO = new GroupDAO();
    }

    public void createGroup(String groupName) {
        try {
            groupDAO.addGroup(groupName);
            System.out.println("Группа создана: " + groupName);
        } catch (SQLException e) {
            System.err.println("Ошибка при создании группы: " + e.getMessage());
        }
    }

    public void deleteGroup(int groupId) {
        try {
            groupDAO.deleteGroup(groupId);
            System.out.println("Группа удалена: ID = " + groupId);
        } catch (SQLException e) {
            System.err.println("Ошибка при удалении группы: " + e.getMessage());
        }
    }

    public List<Group> getAllGroups() {
        try {
            return groupDAO.getAllGroups();
        } catch (SQLException e) {
            System.err.println("Ошибка при получении групп: " + e.getMessage());
            return List.of();
        }
    }
}