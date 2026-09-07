import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public List<String> findAndReplacePattern(
        String[] words,
        String pattern
    ) {

        List<String> result = new ArrayList<>();

        for (String word : words) {

            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(
        String word,
        String pattern
    ) {

        Map<Character, Character> patternToWord =
            new HashMap<>();

        Map<Character, Character> wordToPattern =
            new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char patternCharacter = pattern.charAt(i);
            char wordCharacter = word.charAt(i);

            if (
                patternToWord.containsKey(patternCharacter)
                && patternToWord.get(patternCharacter)
                    != wordCharacter
            ) {
                return false;
            }

            if (
                wordToPattern.containsKey(wordCharacter)
                && wordToPattern.get(wordCharacter)
                    != patternCharacter
            ) {
                return false;
            }

            patternToWord.put(
                patternCharacter,
                wordCharacter
            );

            wordToPattern.put(
                wordCharacter,
                patternCharacter
            );
        }

        return true;
    }
}
