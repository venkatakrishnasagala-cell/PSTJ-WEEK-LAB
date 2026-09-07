class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = nums[0];

        int currentMaximum = nums[0];
        int maximumSum = nums[0];

        int currentMinimum = nums[0];
        int minimumSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int value = nums[i];

            totalSum += value;

            currentMaximum = Math.max(
                value,
                currentMaximum + value
            );

            maximumSum = Math.max(
                maximumSum,
                currentMaximum
            );

            currentMinimum = Math.min(
                value,
                currentMinimum + value
            );

            minimumSum = Math.min(
                minimumSum,
                currentMinimum
            );
        }

        if (maximumSum < 0) {
            return maximumSum;
        }

        int circularSum = totalSum - minimumSum;

        return Math.max(maximumSum, circularSum);
    }
}
