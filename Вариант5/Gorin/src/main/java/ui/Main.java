package ui;
import model.Student;
import service.GroupService;
import service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroupService groupService = new GroupService();
        StudentService studentService = new StudentService();

        while (true) {
            System.out.println("=== Меню ===");
            System.out.println("1. Создать группу");
            System.out.println("2. Удалить группу");
            System.out.println("3. Показать все группы");
            System.out.println("4. Добавить студента");
            System.out.println("5. Удалить студента");
            System.out.println("6. Отметить задачу выполненной");
            System.out.println("7. Выйти");
            System.out.print("Введите номер операции: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // для очистки строки

            switch (choice) {
                case 1 -> {
                    System.out.print("Введите название группы: ");
                    String groupName = scanner.nextLine();
                    groupService.createGroup(groupName);
                }
                case 2 -> {
                    System.out.print("Введите ID группы: ");
                    int groupId = scanner.nextInt();
                    groupService.deleteGroup(groupId);
                }
                case 3 -> {
                    System.out.println("Список групп:");
                    groupService.getAllGroups().forEach(group ->
                            System.out.println("ID: " + group.getId() + ", Название: " + group.getName()));
                }
                case 4 -> {
                    System.out.print("Введите имя студента: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Введите ID группы: ");
                    int groupId = scanner.nextInt();
                    studentService.addStudent(new Student(0, studentName), groupId);
                }
                case 5 -> {
                    System.out.print("Введите ID студента: ");
                    int studentId = scanner.nextInt();
                    studentService.removeStudent(studentId);
                }
                case 6 -> {
                    System.out.print("Введите ID студента: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Введите номер задачи (1-3): ");
                    int taskNumber = scanner.nextInt();
                    studentService.markTaskAsComplete(studentId, taskNumber);
                }
                case 7 -> {
                    System.out.println("Выход...");
                    System.exit(0);
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}