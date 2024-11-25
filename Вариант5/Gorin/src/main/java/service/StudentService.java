package service;
import dao.StudentDAO;
import model.Student;

import java.sql.SQLException;

public class StudentService {
    private final StudentDAO studentDAO;

    public StudentService() {
        this.studentDAO = new StudentDAO();
    }

    public void addStudent(Student student, int groupId) {
        try {
            studentDAO.addStudent(student, groupId);
            System.out.println("Студент добавлен: " + student.getName());
        } catch (SQLException e) {
            System.err.println("Ошибка при добавлении студента: " + e.getMessage());
        }
    }

    public void removeStudent(int studentId) {
        try {
            studentDAO.deleteStudent(studentId);
            System.out.println("Студент удален: ID = " + studentId);
        } catch (SQLException e) {
            System.err.println("Ошибка при удалении студента: " + e.getMessage());
        }
    }

    public void markTaskAsComplete(int studentId, int taskNumber) {
        try {
            studentDAO.updateTaskStatus(studentId, taskNumber, true);
            System.out.println("Задача №" + taskNumber + " отмечена как выполненная для студента ID = " + studentId);
        } catch (SQLException e) {
            System.err.println("Ошибка при обновлении задачи: " + e.getMessage());
        }
    }
}
