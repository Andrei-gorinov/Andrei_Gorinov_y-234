import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число и шаг:");
        int startValue = scanner.nextInt(); 
        int stepValue = scanner.nextInt();  

        System.out.println("Введите значение для остановки:");
        int stopLimit = scanner.nextInt(); 

        displaySquares(startValue, stepValue, stopLimit);
    }

    public static void displaySquares(int startValue, int stepValue, int stopLimit) {
        int currentValue = startValue;
        while (currentValue < stopLimit) {
            int square = currentValue * currentValue;
            System.out.print(square + " ");

            currentValue += stepValue;
        }
    }
}
