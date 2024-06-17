import java.util.Scanner;

public class ThirtyNine {
    public static void main(String[] args) {
        System.out.println(changeText() + " ауч");
    }

    private static String inputStr() {
        System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static String changeText() {
        String inputStr = inputStr();
        StringBuilder result = new StringBuilder();

        char firstChar = ' ';
        boolean isFirstWord = true;

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                result.append(currentChar);
                isFirstWord = true; // Set flag for the next word
            } else {
                if (isFirstWord) {
                    firstChar = currentChar; // Capture the first character of the first word
                    isFirstWord = false;
                }
                result.append(currentChar);
            }
        }

        // Ensure the last word also starts with the first character of the string
        String finalResult = result.toString().trim(); // Trim any trailing whitespace
        String[] words = finalResult.split("\\s+");
        StringBuilder finalText = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                finalText.append(firstChar);
            }
            finalText.append(words[i]);
            if (i < words.length - 1) {
                finalText.append(" ");
            }
        }

        return finalText.toString();
    }
}
