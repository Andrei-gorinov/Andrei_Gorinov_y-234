import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();

        boolean result = doesEndWith(firstString, secondString);
        System.out.println("Результат: " + result);
    }
    
    public static boolean doesEndWith(String firstString, String secondString) {
        return firstString.endsWith(secondString);
    }
}
