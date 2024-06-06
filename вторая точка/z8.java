import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку символов:");
        String input = scanner.nextLine();

        String transformedString = transformString(input);
        System.out.println("Результат: " + transformedString);
    }

    public static String transformString(String input) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        // Подсчитываем количество заглавных и строчных букв
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        // Преобразуем строку в зависимости от количества заглавных и строчных букв
        if (uppercaseCount > lowercaseCount) {
            return input.toUpperCase();
        } else {
            return input.toLowerCase();
        }
    }
}
