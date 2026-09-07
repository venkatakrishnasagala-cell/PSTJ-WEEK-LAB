class Solution {

    public void moveZeroes(int[] nums) {

        int nextPosition = 0;

        for (int number : nums) {

            if (number != 0) {

                nums[nextPosition] = number;

                nextPosition++;
            }
        }

        while (nextPosition < nums.length) {

            nums[nextPosition] = 0;

            nextPosition++;
        }
    }
}
