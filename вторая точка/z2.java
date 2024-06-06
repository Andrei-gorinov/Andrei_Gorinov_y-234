import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите ваше имя:");
        String inputName = scanner.nextLine();

        String formattedName = capitalizeName(inputName);
        System.out.println("Привет, " + formattedName + "!");
    }

    public static String capitalizeName(String name) {
        String capitalizedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return capitalizedName;
    }
}
