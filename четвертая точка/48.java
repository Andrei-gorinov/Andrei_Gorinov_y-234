import java.util.Arrays;
import java.util.Scanner;

public class Equations {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Arrays.toString(result()));
    }

    private static int putUser() {
        System.out.println("Введите число x ");
        int inp = in.nextInt();
        return inp;
    }

    private static int[] arrayX(int x) {
        int y = 1;
        int[] result = new int[15];
        for (int i = 0; i < result.length; ++i) {
            result[i] = y;
            y = 2 * x + 1;
            ++x;
        }
        return result;
    }

    private static int[] arrayZ(int x) {
        int z = 1;
        int[] result = new int[15];
        for (int i = 0; i < result.length; ++i) {
            result[i] = z;
            z = 3 * x + 1;
            ++x;
        }
        return result;
    }

    private static int[] result() {
        int x = putUser();
        int[] arrayY = arrayX(x);
        int[] arrayZ = arrayZ(x);
        
        int[] result = new int[30];
        int i = 0, j = 0, k = 0;

        while (i < result.length && j < arrayY.length && k < arrayZ.length) {
            if (arrayY[j] <= 13) {
                if (arrayY[j] == arrayZ[k]) {
                    result[i++] = arrayY[j];
                    j++;
                    k++;
                } else if (arrayY[j] < arrayZ[k]) {
                    result[i++] = arrayY[j++];
                } else {
                    result[i++] = arrayZ[k++];
                }
            } else {
                if (arrayY[j] == arrayZ[k]) {
                    result[i++] = arrayY[j++];
                    result[i++] = arrayZ[k++];
                } else if (arrayY[j] < arrayZ[k]) {
                    result[i++] = arrayY[j++];
                } else {
                    result[i++] = arrayZ[k++];
                }
            }
        }
        
        return Arrays.copyOf(result, i); // Вернуть массив без лишних нулевых элементов
    }
}
