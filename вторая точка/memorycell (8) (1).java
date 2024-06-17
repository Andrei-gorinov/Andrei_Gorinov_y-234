import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа: начальное значение, шаг и количество шагов:");
        int startValue = scanner.nextInt(); 
        int stepValue = scanner.nextInt();  
        int totalSteps = scanner.nextInt(); 

        generateSeries(startValue, stepValue, totalSteps);
    }

    public static void generateSeries(int startValue, int stepValue, int totalSteps) {
        int currentValue = startValue;
        for (int i = 0; i < totalSteps; i++) {
            System.out.print(currentValue + " ");
            currentValue += stepValue;
        }
    }
}
