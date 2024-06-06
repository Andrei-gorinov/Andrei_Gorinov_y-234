import java.util.Scanner;

public class FindSquareDifference {

    private static final int MAX_INPUT = 100000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 0 || n > MAX_INPUT) {
            printOutOfRangeError();
            return;
        }

        int lowerSquare = (int) Math.floor(Math.sqrt(n));
        int upperSquare = lowerSquare + 1;

        if (upperSquare * upperSquare - lowerSquare * lowerSquare == n) {
            System.out.println(n + " = " + upperSquare * upperSquare + " - " + lowerSquare * lowerSquare);
        } else {
            printNoSquareDifferenceFound(n);
        }
    }

    private static void printOutOfRangeError() {
        System.out.println("Число должно быть в диапазоне от 0 до " + MAX_INPUT);
    }

    private static void printNoSquareDifferenceFound(int n) {
        System.out.println("Невозможно представить " + n + " как разность двух последовательных квадратов");
    }
}
