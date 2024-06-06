import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для шифрования:");
        String input = scanner.nextLine();

        System.out.println("Введите величину сдвига (положительный для правого, отрицательный для левого):");
        int shift = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.println("Введите задание (зашифровать или расшифровать):");
        String direction = scanner.nextLine();

        String output;
        if (direction.equalsIgnoreCase("зашифровать")) {
            output = encrypt(input, shift);
        } else if (direction.equalsIgnoreCase("расшифровать")) {
            output = decrypt(input, shift);
        } else {
            System.out.println("Неверное слово. Пожалуйста, введите \"зашифровать\" или \"расшифровать\".");
            return;
        }

        System.out.println("Результат:");
        System.out.println(output);
    }

    private static String encrypt(String input, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                int shiftedChar = (ch - base + shift) % 26 + base;
                encrypted.append((char) shiftedChar);
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    private static String decrypt(String input, int shift) {
        return encrypt(input, -shift);
    }
}
