import java.util.ArrayList;

class GFG {

    static ArrayList<Integer> search(
        String pattern,
        String text
    ) {

        ArrayList<Integer> result =
            new ArrayList<>();

        int patternLength = pattern.length();
        int textLength = text.length();

        for (
            int start = 0;
            start <= textLength - patternLength;
            start++
        ) {

            int index = 0;

            while (
                index < patternLength
                && text.charAt(start + index)
                    == pattern.charAt(index)
            ) {
                index++;
            }

            if (index == patternLength) {
                result.add(start);
            }
        }

        return result;
    }
}
