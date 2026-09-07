import java.util.ArrayList;
import java.util.List;

class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        int currentSum = arr.get(0);
        int maximumSubarraySum = arr.get(0);

        int maximumElement = arr.get(0);
        int positiveSum = 0;

        for (int value : arr) {

            if (value > 0) {
                positiveSum += value;
            }

            maximumElement = Math.max(maximumElement, value);
        }

        for (int i = 1; i < arr.size(); i++) {

            int value = arr.get(i);

            currentSum = Math.max(value, currentSum + value);

            maximumSubarraySum = Math.max(
                maximumSubarraySum,
                currentSum
            );
        }

        int maximumSubsequenceSum;

        if (positiveSum > 0) {
            maximumSubsequenceSum = positiveSum;
        } else {
            maximumSubsequenceSum = maximumElement;
        }

        List<Integer> result = new ArrayList<>();

        result.add(maximumSubarraySum);
        result.add(maximumSubsequenceSum);

        return result;
    }
}
