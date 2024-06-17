import java.util.ArrayList;

public class ThirtyOne {
    public static void main(String[] args) {
        int kilometers = 175;
        ArrayList<Integer> arrayCity = new ArrayList<>();
        arrayCity.add(50);
        arrayCity.add(55);
        arrayCity.add(57);
        arrayCity.add(58);
        arrayCity.add(60);
        System.out.println("Результат работы: " + chooseBestSum(kilometers, arrayCity));
    }

    private static int chooseBestSum(int kilometers, ArrayList<Integer> arrayCity) {
        int result = -1; // Initialize result to -1 to indicate no valid sum found yet
        
        // Iterate through all combinations of three cities
        for (int i = 0; i < arrayCity.size(); i++) {
            for (int j = i + 1; j < arrayCity.size(); j++) {
                for (int k = j + 1; k < arrayCity.size(); k++) {
                    int sum = arrayCity.get(i) + arrayCity.get(j) + arrayCity.get(k);
                    if (sum <= kilometers && sum > result) {
                        result = sum; // Update result if the current sum is greater and within the limit
                    }
                }
            }
        }

        return result;
    }
}
