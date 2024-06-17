import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод трех чисел от пользователя
        System.out.println("Введите три числа (начальное число, шаг и количество шагов):");
        int startNum = scanner.nextInt();
        int stepNum = scanner.nextInt();
        int steps = scanner.nextInt();

        // Печать последовательности чисел
        printSeries(startNum, stepNum, steps);

        // Закрытие сканера
        scanner.close();
    }
    
    // Метод для печати последовательности чисел
    public static void printSeries(int startNum, int stepNum, int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.print(startNum + stepNum * i + " ");
        }
        System.out.println();
    }
}
