import java.util.Arrays;
import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args) {
        int index = new ThirtyTwo().inputUser();
        if (index >= 10 && index <= 100000) {
            long resFibonacci = new ThirtyTwo().searchFibonacci(index);
            int[] result = biggestCount(resFibonacci);
            System.out.println("Наибольшее количество повторений: " + result[0]);
            System.out.println("Цифра с наибольшим количеством повторений: " + result[1]);
        } else {
            System.out.println("Число должно быть от 10 до 100000");
        }
    }

    private int inputUser() {
        System.out.println("Введите индекс: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private long searchFibonacci(int index) {
        if (index <= 1) {
            return index;
        }
        long a = 0, b = 1, c = 1;
        for (int i = 2; i < index; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private static int[] biggestCount(long resFibonacci) {
        String fibon = Long.toString(resFibonacci);
        int[] count = new int[10]; // Array to store count of each digit from 0 to 9

        for (int i = 0; i < fibon.length(); ++i) {
            int digit = fibon.charAt(i) - '0';
            count[digit]++;
        }

        int maxCount = 0;
        int digitWithMaxCount = 0;

        for (int i = 0; i < 10; ++i) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                digitWithMaxCount = i;
            }
        }

        return new int[]{maxCount, digitWithMaxCount};
    }
}
