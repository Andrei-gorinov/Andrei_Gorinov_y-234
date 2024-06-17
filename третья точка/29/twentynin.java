import java.util.Scanner;

public class TwentyNin {
    public static void main(String[] args) {
        TwentyNin instance = new TwentyNin();
        int number = instance.userPutInt();
        System.out.println("Результат работы: " + differenceSquare(number));
    }

    private int userPutInt() {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static String differenceSquare(int number) {
        for (int i = 1; i <= 100000; ++i) {
            int currentSquare = i * i;
            int previousSquare = (i - 1) * (i - 1);
            if (currentSquare - previousSquare == number) {
                return number + " = " + currentSquare + " - " + previousSquare;
            }
        }
        return "No solution found for the given number within the range.";
    }
}
