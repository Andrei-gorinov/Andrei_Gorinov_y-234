import java.util.Arrays;
import java.util.Scanner;

public class TwentyEight {
    public static void main(String[] args) {
        TwentyEight instance = new TwentyEight();
        String line = instance.userPutString();
        String direction = instance.userPutString();
        int shift = instance.userPutInt();
        char[] matrixWords = instance.matrixWords();

        System.out.println("Результат работы: " + caesarsCipher(line, direction, shift, matrixWords));
    }

    private String userPutString() {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private int userPutInt() {
        System.out.println("Введите сдвиг: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private char[] matrixWords() {
        int j = 0;
        char[] matrixWords = new char[32];
        for (char i = 'а'; i <= 'я'; ++i) {
            matrixWords[j] = i;
            ++j;
        }
        System.out.println(Arrays.toString(matrixWords));
        return matrixWords;
    }

    private static StringBuilder caesarsCipher(String line, String direction, int shift, char[] matrixWords) {
        StringBuilder result = new StringBuilder();
        if (direction.equalsIgnoreCase("справа")) {
            for (int j = 0; j < line.length(); ++j) {
                boolean found = false;
                for (int i = 0; i < matrixWords.length; ++i) {
                    if (matrixWords[i] == line.charAt(j)) {
                        result.append(matrixWords[(i + shift) % matrixWords.length]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    result.append(line.charAt(j));
                }
            }
        } else if (direction.equalsIgnoreCase("слева")) {
            for (int j = 0; j < line.length(); ++j) {
                boolean found = false;
                for (int i = 0; i < matrixWords.length; ++i) {
                    if (matrixWords[i] == line.charAt(j)) {
                        result.append(matrixWords[(i - shift + matrixWords.length) % matrixWords.length]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    result.append(line.charAt(j));
                }
            }
        }
        return result;
    }
}
