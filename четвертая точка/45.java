import java.util.Scanner;

public class ConvertYearsToRoman {
    // Создание объекта Scanner для ввода данных
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Запрос ввода года у пользователя
        System.out.println("Введите год: ");
        int years = scanner.nextInt();

        // Проверка корректности введенного года
        if (years < 1 || years > 9999) {
            System.out.println("Количество лет должно быть в диапазоне от 1 до 9999");
        } else {
            // Преобразование года в римские числа и вывод результата
            String romanYears = convertToRoman(years);
            System.out.println(years + " в римских числах равно " + romanYears);
        }
    }

    // Метод для преобразования года в римские числа
    static String convertToRoman(int years) {
        // Массивы римских символов и соответствующих им значений
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // Использование StringBuilder для эффективного построения строки
        StringBuilder romanYears = new StringBuilder();

        // Преобразование целого числа в римские цифры
        for (int i = 0; i < romanValues.length; i++) {
            while (years >= romanValues[i]) {
                years -= romanValues[i];
                romanYears.append(romanSymbols[i]);
            }
        }
        return romanYears.toString();
    }
}
