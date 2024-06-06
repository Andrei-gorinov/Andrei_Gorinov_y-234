public class Fibonacci {

    public static void main(String[] args) {
        int i = 1000;
        long fibonacciNumber = fibonacci(i);
        System.out.println("f(" + i + ") = " + fibonacciNumber + " # вернет " + maxDigitFrequency(fibonacciNumber));
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, c = 0;
        for (int j = 2; j <= n; j++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int maxDigitFrequency(long number) {
        int[] frequencyArray = new int[10];
        char[] digits = String.valueOf(number).toCharArray();

        for (char digit : digits) {
            frequencyArray[digit - '0']++;
        }

        int maxFrequency = 0;
        int maxDigit = 0;

        for (int i = 0; i < 10; i++) {
            if (frequencyArray[i] > maxFrequency || (frequencyArray[i] == maxFrequency && i > maxDigit)) {
                maxFrequency = frequencyArray[i];
                maxDigit = i;
            }
        }

        return maxDigit;
    }
}
