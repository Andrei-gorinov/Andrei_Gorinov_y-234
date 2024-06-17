import java.util.Arrays;
import java.util.Scanner;

public class ThirtyEight {
    public static void main(String[] args) {
        System.out.println(solvingNumbers());
    }

    public static String userPutString(){
        System.out.println("Введите строку из 4 чисел: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static int[] collectingArray() {
        String userPut = userPutString();
        int[] arrayComparison = new int[4];
        if (userPut.length() == 4) {
            for (int i = 0; i < arrayComparison.length; ++i) {
                arrayComparison[i] = Character.getNumericValue(userPut.charAt(i));
            }
        } else {
            System.out.println("Неправильный ввод. Попробуйте снова.");
            arrayComparison = collectingArray(); // Recursive call until correct input is given
        }
        System.out.println(Arrays.toString(arrayComparison));
        return arrayComparison;
    }

    private static int[] makeNumber() {
        int[] arrayMake = new int[4];
        for (int i = 0; i < arrayMake.length; i++) {
            arrayMake[i] = (int) (Math.random() * 10); // Generate random digits from 0 to 9
        }
        return arrayMake;
    }

    private static String solvingNumbers() {
        int[] arrayComparison = collectingArray();
        int count = 0;
        int[] arrayMake = makeNumber();

        for (int i = 0; i < 20; ++i) {
            count = 0;
            for (int j = 0; j < arrayMake.length; ++j) {
                if (arrayMake[j] == arrayComparison[j]) {
                    ++count;
                }
            }
            if (count == 4) {
                System.out.println("Вы отгадали");
                return "Вы отгадали: " + Arrays.toString(arrayComparison);
            } else {
                System.out.println("Вы не отгадали, количество совпадений: " + count);
                if (i < 19) {
                    arrayComparison = collectingArray();
                }
            }
        }
        return "Вы проиграли, попробуйте еще раз";
    }
}
