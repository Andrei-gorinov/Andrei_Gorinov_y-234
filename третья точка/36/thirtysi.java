import java.util.Arrays;
import java.util.Scanner;

public class ThirtySix {
    public static void main(String[] args) {
        String line = userPutString();
        String wordKey = userPutStringKey();
        char[] matrixWords = matrixWords();

        System.out.println("Результат работы: " + caesarsCipher(line, wordKey, matrixWords));
    }

    private static String userPutString() {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static String userPutStringKey() {
        System.out.println("Введите слово-ключ: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static char[] matrixWords() {
        char[] matrixWords = new char[32];
        for (int i = 0; i < matrixWords.length; i++) {
            matrixWords[i] = (char) ('а' + i); // Fill matrix with Russian alphabet 'а' to 'я'
        }
        System.out.println(Arrays.toString(matrixWords));
        return matrixWords;
    }

    private static StringBuilder caesarsCipher(String line, String wordKey, char[] matrixWords) {
        StringBuilder result = new StringBuilder();
        int shift = calculateShift(wordKey, matrixWords);

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (Character.isLetter(currentChar)) { // Process only letters
                int index = findCharIndex(currentChar, matrixWords);
                if (index != -1) {
                    int newIndex = (index + shift) % matrixWords.length;
                    if (newIndex < 0) {
                        newIndex += matrixWords.length;
                    }
                    result.append(matrixWords[newIndex]);
                } else {
                    result.append(currentChar); // Append non-alphabetic characters as is
                }
            } else {
                result.append(currentChar); // Append non-letter characters as is
            }
        }

        return result;
    }

    private static int calculateShift(String wordKey, char[] matrixWords) {
        int k = 0;
        for (int j = 0; j < wordKey.length(); ++j) {
            for (int i = 0; i < matrixWords.length; ++i) {
                if (wordKey.charAt(j) == matrixWords[i]) {
                    k = i;
                    break;
                }
            }
        }
        return k;
    }

    private static int findCharIndex(char c, char[] matrixWords) {
        for (int i = 0; i < matrixWords.length; i++) {
            if (Character.toLowerCase(c) == matrixWords[i]) {
                return i;
            }
        }
        return -1; // Character not found in matrixWords
    }
}
