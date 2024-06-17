import java.util.Scanner;

public class MemoryCell {
    private int[] numbers = new int[3];
    private int numOfElements = 0;

    // Метод для вставки числа в ячейку памяти
    public void insertNumber(int num) {
        if (numOfElements < 3) {
            numbers[numOfElements] = num;
            numOfElements++;
        } else {
            int minIndex = findMinIndex();
            numbers[minIndex] = num;
        }
    }

    // Метод для нахождения индекса минимального числа в массиве
    public int findMinIndex() {
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Метод для печати чисел, хранящихся в ячейке памяти
    public void printNumbers() {
        System.out.println("Числа в ячейке памяти:");
        for (int i = 0; i < numOfElements; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemoryCell memoryCell = new MemoryCell();

        while (true) {
            System.out.print("Введите число (или -1 для выхода): ");
            int number = scanner.nextInt();
            
            if (number == -1) {
                break;
            }

            memoryCell.insertNumber(number);
            memoryCell.printNumbers();
        }

        scanner.close();
    }
}
