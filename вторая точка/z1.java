import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        boolean result = hasEnding(str1, str2);
        System.out.println("Совпадение окончания: " + result);
    }

    public static boolean hasEnding(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false; 
        }

        String ending = str1.substring(str1.length() - str2.length());

        return ending.equals(str2);
    }
}
