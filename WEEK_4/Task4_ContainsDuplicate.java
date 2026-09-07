import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> numbers = new HashSet<>();

        for (int number : nums) {

            if (!numbers.add(number)) {
                return true;
            }
        }

        return false;
    }
}
