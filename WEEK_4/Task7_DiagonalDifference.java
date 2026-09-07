import java.util.List;

class Result {

    public static int diagonalDifference(
        List<List<Integer>> arr
    ) {

        int size = arr.size();

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < size; i++) {

            primaryDiagonal += arr.get(i).get(i);

            secondaryDiagonal +=
                arr.get(i).get(size - 1 - i);
        }

        return Math.abs(
            primaryDiagonal - secondaryDiagonal
        );
    }
}
