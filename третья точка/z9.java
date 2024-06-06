import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final int MAX_ATTEMPTS = 20;

    public static void main(String[] args) {
        int[] secretCode = generateSecretCode();
        int[] guess = new int[4];
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру! Попробуйте угадать секретный код менее чем за " + MAX_ATTEMPTS + " попыток.");

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Введите свои догадки (4 числа):");
            for (int i = 0; i < 4; i++) {
                while (true) {
                    if (scanner.hasNextInt()) {
                        guess[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Неверный формат ввода. Пожалуйста, введите целое число.");
                        scanner.next();
                    }
                }
            }

            int correctDigits = checkGuess(secretCode, guess);

            if (correctDigits == 4) {
                System.out.println("Поздравляю! Вы угадали секретный код: " + Arrays.toString(secretCode));
                break;
            } else {
                System.out.println("Правильные цифры: " + correctDigits);
            }

            attempts++;
        }

        if (attempts >= MAX_ATTEMPTS) {
            System.out.println("У вас закончились попытки. Секретный код был: " + Arrays.toString(secretCode));
        }

        scanner.close();
    }

    public static int[] generateSecretCode() {
        int[] code = new int[4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            code[i] = random.nextInt(10);
        }

        return code;
    }

    public static int checkGuess(int[] secretCode, int[] guess) {
        int correct = 0;

        for (int i = 0; i < 4; i++) {
            if (secretCode[i] == guess[i]) {
                correct++;
            }
        }

        return correct;
    }
}
