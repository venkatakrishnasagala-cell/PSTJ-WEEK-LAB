import java.util.List;

class Result {

    public static int birthday(List<Integer> s, int d, int m) {

        if (m > s.size()) {
            return 0;
        }

        int windowSum = 0;
        int count = 0;

        for (int i = 0; i < m; i++) {
            windowSum += s.get(i);
        }

        if (windowSum == d) {
            count++;
        }

        for (int i = m; i < s.size(); i++) {

            windowSum += s.get(i);

            windowSum -= s.get(i - m);

            if (windowSum == d) {
                count++;
            }
        }

        return count;
    }
}
