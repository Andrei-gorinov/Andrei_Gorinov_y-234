import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод имени пользователя
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        // Приветствие пользователя
        greetUser(name);
    }

    // Метод для приветствия пользователя
    public static void greetUser(String name) {
        // Преобразование первой буквы в заглавную, а остальных в строчные
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Привет, " + formattedName + "!");
    }
}
