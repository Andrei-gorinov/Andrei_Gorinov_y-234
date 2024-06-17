import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] memoryCells = new int[3];
        int currentIndex = 0;

        while (true) {
            System.out.println("Введите число (для выхода введите 0):");
            int inputNumber = scanner.nextInt();

            if (inputNumber == 0) {
                break;
            }

            if (currentIndex < memoryCells.length) {
                memoryCells[currentIndex] = inputNumber;
                currentIndex++;
            } else {
                int minIndex = findMinIndex(memoryCells);
                if (inputNumber > memoryCells[minIndex]) {
                    memoryCells[minIndex] = inputNumber;
                }
            }
        }

        System.out.println("Результат:");
        for (int value : memoryCells) {
            System.out.print(value + " ");
        }
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
