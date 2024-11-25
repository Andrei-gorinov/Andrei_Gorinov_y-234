package dao;
import config.DatabaseConfig;
import model.Group;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GroupDAO {
    public void addGroup(String groupName) throws SQLException {
        String sql = "INSERT INTO groupp (name) VALUES (?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, groupName);
            stmt.executeUpdate();
        }
    }

    public void deleteGroup(int groupId) throws SQLException {
        String sql = "DELETE FROM groupp WHERE id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, groupId);
            stmt.executeUpdate();
        }
    }

    public List<Group> getAllGroups() throws SQLException {
        List<Group> groups = new ArrayList<>();
        String sql = "SELECT * FROM groupp";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Group group = new Group(rs.getInt("id"), rs.getString("name"));
                groups.add(group);
            }
        }
        return groups;
    }
}