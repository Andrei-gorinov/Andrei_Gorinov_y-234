import java.util.HashMap;
import java.util.Scanner;

public class RomanToArabicConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год римскими цифрами:  ");
        String romanNumber = in.nextLine().toUpperCase(); // Приведение к верхнему регистру для корректной обработки
        int arabicNumber = convertRomanToArabic(romanNumber);
        
        if (arabicNumber != -1) {
            System.out.println("Римское число " + romanNumber + " в арабском формате: " + arabicNumber);
        } else {
            System.out.println("Некорректное римское число: " + romanNumber);
        }
    }

    public static int convertRomanToArabic(String romanNumber) {
        // Карта для хранения римских символов и их значений
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Обработка строки римских чисел с конца к началу
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char romanChar = romanNumber.charAt(i);

            // Проверка на наличие символа в карте
            if (!romanMap.containsKey(romanChar)) {
                return -1; // Возвращаем -1, если символ некорректен
            }

            int curValue = romanMap.get(romanChar);
            
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }
        return result;
    }
}
