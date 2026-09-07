class Solution {

    public boolean halvesAreAlike(String s) {

        int middle = s.length() / 2;
        int vowelCountFirstHalf = 0;
        int vowelCountSecondHalf = 0;

        for (int i = 0; i < middle; i++) {

            if (isVowel(s.charAt(i))) {
                vowelCountFirstHalf++;
            }
        }

        for (int i = middle; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                vowelCountSecondHalf++;
            }
        }

        return vowelCountFirstHalf == vowelCountSecondHalf;
    }

    private boolean isVowel(char character) {

        return character == 'a'
            || character == 'e'
            || character == 'i'
            || character == 'o'
            || character == 'u'
            || character == 'A'
            || character == 'E'
            || character == 'I'
            || character == 'O'
            || character == 'U';
    }
}
