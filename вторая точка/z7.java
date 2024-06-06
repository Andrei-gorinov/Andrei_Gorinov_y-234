import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String result = removeDuplicateWords(input);
        System.out.println("Результат: " + result);
    }

    public static String removeDuplicateWords(String input) {
        // Разбиваем строку на массив слов
        String[] words = input.split("\\s+");

        // Используем LinkedHashSet для сохранения порядка и удаления дубликатов
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        // Собираем уникальные слова обратно в строку
        String result = String.join(" ", uniqueWords);

        return result;
    }
}
