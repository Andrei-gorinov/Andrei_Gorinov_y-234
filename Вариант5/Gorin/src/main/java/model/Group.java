package model;
import java.util.ArrayList;
import java.util.List; // Добавляем импорт List

public class Group {
    private int id;
    private String name;
    private List<Student> students; // Используем List для хранения студентов

    // Конструктор
    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>(); // Инициализируем список студентов
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Метод для добавления студента в группу
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Метод для удаления студента из группы
    public void removeStudent(Student student) {
        this.students.remove(student);
    }
}