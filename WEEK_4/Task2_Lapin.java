import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            String word = scanner.next();

            int length = word.length();
            int middle = length / 2;

            int[] frequencyFirstHalf = new int[26];
            int[] frequencySecondHalf = new int[26];

            for (int i = 0; i < middle; i++) {

                frequencyFirstHalf[
                    word.charAt(i) - 'a'
                ]++;
            }

            for (
                int i = length - middle;
                i < length;
                i++
            ) {

                frequencySecondHalf[
                    word.charAt(i) - 'a'
                ]++;
            }

            boolean isLapindrome = true;

            for (int i = 0; i < 26; i++) {

                if (
                    frequencyFirstHalf[i]
                    != frequencySecondHalf[i]
                ) {

                    isLapindrome = false;
                    break;
                }
            }

            System.out.println(
                isLapindrome ? "YES" : "NO"
            );
        }

        scanner.close();
    }
}
