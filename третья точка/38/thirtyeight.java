import java.util.ArrayList;
import java.util.Scanner;

public class ThirtyEight {
    public static void main(String[] args) {
        System.out.println("Победитель: " + everyThird());
    }

    private static ArrayList<Integer> generateParticipants(int count) {
        ArrayList<Integer> participants = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            participants.add(i);
        }
        return participants;
    }

    private static int userPutStart(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер первого участника (от 1 до " + count + "): ");
        int start = scanner.nextInt();
        if (start < 1 || start > count) {
            System.out.println("Некорректный номер. Попробуйте снова.");
            return userPutStart(count);
        }
        return start;
    }

    private static int everyThird() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество участников: ");
        int longArray = scanner.nextInt();

        ArrayList<Integer> participants = generateParticipants(longArray);
        int startIndex = userPutStart(longArray) - 1;

        while (participants.size() > 1) {
            startIndex = (startIndex + 2) % participants.size(); // Move to the next third person
            participants.remove(startIndex);
            if (startIndex == participants.size()) {
                startIndex = 0; // Wrap around to the beginning if we're at the end of the list
            }
        }

        return participants.get(0);
    }
}
