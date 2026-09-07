class Solution {

    public int myAtoi(String s) {

        int index = 0;
        int length = s.length();

        while (
            index < length
            && s.charAt(index) == ' '
        ) {
            index++;
        }

        int sign = 1;

        if (index < length) {

            char currentCharacter = s.charAt(index);

            if (
                currentCharacter == '+'
                || currentCharacter == '-'
            ) {

                if (currentCharacter == '-') {
                    sign = -1;
                }

                index++;
            }
        }

        int number = 0;

        while (
            index < length
            && Character.isDigit(s.charAt(index))
        ) {

            int digit = s.charAt(index) - '0';

            if (
                number > Integer.MAX_VALUE / 10
                || (
                    number == Integer.MAX_VALUE / 10
                    && digit > 7
                )
            ) {

                if (sign == 1) {
                    return Integer.MAX_VALUE;
                }

                return Integer.MIN_VALUE;
            }

            number = number * 10 + digit;

            index++;
        }

        return number * sign;
    }
}
