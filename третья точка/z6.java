public class WoodenSticksGame {

    // Функция для расчета количества палочек после игры
    public static int calculateRemainingSticks(int initialSticks) {
        while (initialSticks > 1) {
            if (initialSticks % 2 == 0) {
                initialSticks /= 2;
            } else {
                initialSticks--;
            }
        }
        return initialSticks;
    }

    public static void main(String[] args) {
        int initialSticks = 357983; // количество палочек на столе
        int tanyaSticks = calculateRemainingSticks(initialSticks);

        System.out.println("Палочек у Тани после игры: " + tanyaSticks);
    }
}
