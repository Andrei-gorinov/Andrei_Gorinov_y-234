import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWeightsInGym {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(56);
        numbers.add(65);
        numbers.add(74);
        numbers.add(100);
        numbers.add(99);
        numbers.add(68);
        numbers.add(86);
        numbers.add(180);
        numbers.add(90);

        // Проверка на null и сортировка списка
        if (numbers != null) {
            Collections.sort(numbers, Comparator.comparingInt(SortWeightsInGym::getDigitSum).thenComparingInt(num -> num));
        }

        // Вывод отсортированного списка
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Метод для вычисления суммы цифр числа
    private static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
