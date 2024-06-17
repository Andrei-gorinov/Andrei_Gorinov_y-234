import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел от пользователя
        System.out.println("Введите два числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Определение количества шагов и начального значения
        int count = Math.max(num1, num2);
        int start = Math.min(num1, num2);
        int step = start;

        // Печать последовательности чисел
        for (int i = 0; i < count; i++) {
            System.out.print(start * start + " ");
            start += step;
        }

        // Закрытие сканера
        scanner.close();
    }
}
