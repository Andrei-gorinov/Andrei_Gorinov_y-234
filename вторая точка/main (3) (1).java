import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки пользователя
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        // Вывод строки без гласных
        String resultString = removeVowels(inputString);
        System.out.println("Строка без гласных: " + resultString);
    }
    
    // Метод для удаления гласных из строки
    public static String removeVowels(String inputString) {
        return inputString.replaceAll("[aeiouAEIOU]", "");
    }
}
