import java.util.Arrays;

public class ChooseBestSum {

    public static void main(String[] args) {
        int[] distances = {50, 55, 57, 58, 60};
        int maxDistance = 175;
        int numCities = 3;

        int bestSum = chooseBestSum(maxDistance, numCities, distances);

        System.out.println(bestSum);
    }

    public static int chooseBestSum(int maxDistance, int numCities, int[] distances) {
        Arrays.sort(distances);
        int bestSum = -1;

        for (int i = 0; i <= distances.length - numCities; i++) {
            int sum = distances[i];
            if (sum <= maxDistance) {
                int[] selectedDistances = Arrays.copyOfRange(distances, i + 1, i + numCities);
                int combinationSum = sum + getSum(selectedDistances);
                if (combinationSum <= maxDistance && combinationSum > bestSum) {
                    bestSum = combinationSum;
                }
            }
        }

        return bestSum;
    }

    private static int getSum(int[] distances) {
        int sum = 0;
        for (int distance : distances) {
            sum += distance;
        }
        return sum;
    }
}
