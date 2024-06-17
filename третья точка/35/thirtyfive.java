import java.util.Arrays;
import java.util.Scanner;

public class ThirtyFive { 
    public static void main(String[] args) {
        String[] inputMass = inputMass();
        System.out.println(Arrays.toString(sortBySumOfDigits(inputMass)));
    }

    private static String[] inputMass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume newline left from nextInt()

        System.out.println("Введите числа в массив: ");
        String[] arrayMass = new String[length];
        for (int i = 0; i < length; ++i) {
            arrayMass[i] = scanner.nextLine();
        }
        return arrayMass;
    }

    private static String[] sortBySumOfDigits(String[] inputMass) {
        Arrays.sort(inputMass, (a, b) -> {
            int sumA = calculateSumOfDigits(a);
            int sumB = calculateSumOfDigits(b);
            return Integer.compare(sumA, sumB);
        });
        return inputMass;
    }

    private static int calculateSumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0'; // Convert char to integer value
            }
        }
        return sum;
    }
}
