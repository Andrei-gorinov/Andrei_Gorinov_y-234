import java.util.Scanner;

public class TaskThirtyFour {
    public static void main(String[] args) {
        int number = inputUser();
        System.out.println("У Тани будет " + countSticks(number));
    }

    private static int inputUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        if (number >= 1 && number <= Math.pow(10, 18)) {
            return number;
        } else {
            System.out.println("Число должно быть в диапазоне от 1 до " + Math.pow(10, 18));
            return 0; // Return 0 to signify an invalid input
        }
    }

    private static int countSticks(int number) {
        if (number % 2 == 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Сколько взять: ");
            String howMuch = in.nextLine().trim();
            if (howMuch.equalsIgnoreCase("Половину")) {
                return 1; // Return 1 when "Половину" is entered for even number
            } else {
                return number / 2;
            }
        } else {
            // For odd numbers, return half of (number - 1)
            return (number - 1) / 2;
        }
    }
}
