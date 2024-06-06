import java.util.Scanner;

public class SumOfPowers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = input.nextInt();

        System.out.println("Введите стартовую степень:");
        int startIndex = input.nextInt();

        int sum = calculatePowerSum(number, startIndex);

        boolean isPossible = isSumMultipleOf64(sum);

        System.out.println(isPossible ? "Yes" : "No");
    }

    private static int calculatePowerSum(int number, int startIndex) {
        int sum = 0;
        int power = startIndex;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, power);
            number /= 10;
            power++;
        }
        return sum;
    }

    private static boolean isSumMultipleOf64(int sum) {
        return sum % 64 == 0;
    }
}
