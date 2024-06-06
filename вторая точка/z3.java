import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String output = eliminateVowels(input);
        System.out.println("Результат: " + output);
    }

    public static String eliminateVowels(String str) {
        String vowelsPattern = "[fghjffghj:JKL:;]";
        return str.replaceAll(vowelsPattern, "");
    }
}
