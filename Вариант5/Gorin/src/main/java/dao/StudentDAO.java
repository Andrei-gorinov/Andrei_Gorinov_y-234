package dao;
import config.DatabaseConfig;
import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(Student student, int groupId) throws SQLException {
        String sql = "INSERT INTO students (name, group_id, task1, task2, task3) VALUES (?, ?, FALSE, FALSE, FALSE)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getName());  // Используем getName()
            stmt.setInt(2, groupId);
            stmt.executeUpdate();
        }
    }

    public void deleteStudent(int studentId) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, studentId);
            stmt.executeUpdate();
        }
    }

    public void updateTaskStatus(int studentId, int taskNumber, boolean status) throws SQLException {
        String sql = "UPDATE students SET task" + taskNumber + " = ? WHERE id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, status);
            stmt.setInt(2, studentId);
            stmt.executeUpdate();
        }
    }

    public List<Student> getStudentsByGroup(int groupId) throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE group_id = ?";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, groupId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Student student = new Student(
                            rs.getInt("id"),
                            rs.getString("name")
                    );
                    student.getTasks()[0] = rs.getBoolean("task1");
                    student.getTasks()[1] = rs.getBoolean("task2");
                    student.getTasks()[2] = rs.getBoolean("task3");
                    students.add(student);
                }
            }
        }
        return students;
    }
}