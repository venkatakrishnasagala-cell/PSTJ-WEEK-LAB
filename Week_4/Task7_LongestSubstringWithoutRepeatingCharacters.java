import java.util.HashSet;
import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> characters = new HashSet<>();

        int left = 0;
        int maximumLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char currentCharacter = s.charAt(right);

            while (characters.contains(currentCharacter)) {

                characters.remove(s.charAt(left));

                left++;
            }

            characters.add(currentCharacter);

            int currentLength = right - left + 1;

            maximumLength = Math.max(
                maximumLength,
                currentLength
            );
        }

        return maximumLength;
    }
}
