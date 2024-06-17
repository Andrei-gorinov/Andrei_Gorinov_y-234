import java.util.Scanner;

public class Thirty {
    public static void main(String[] args) {
        Thirty thirty = new Thirty();
        int numbers = thirty.userPutInt();
        int start = thirty.userPutStart();

        System.out.println("Результат работы: " + scriptMath(numbers, start));
    }

    private int userPutInt() {
        System.out.println("Введите длину ряда: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private int userPutStart() {
        System.out.println("Введите стартовое число: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static String scriptMath(int numbers, int start) {
        int sum = 0;
        String numberString = Integer.toString(start);
        int[] matrixStart = new int[numberString.length()];
        char[] charArray = numberString.toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < matrixStart.length; ++i) {
            matrixStart[i] = Character.getNumericValue(charArray[i]);
        }

        for (int i = 0; i < matrixStart.length; ++i) {
            sum += Math.pow(matrixStart[i], numbers);
            result.append(matrixStart[i]).append("^").append(numbers);
            if (i + 1 < matrixStart.length) {
                result.append("+");
            }
            ++numbers;
        }

        result.append("=").append(sum);

        return result.toString();
    }
}
