import java.util.*;

class Result {

    public static void matrixRotation(
        List<List<Integer>> matrix,
        int r
    ) {

        int rows = matrix.size();
        int columns = matrix.get(0).size();

        int layers = Math.min(rows, columns) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = rows - 1 - layer;
            int right = columns - 1 - layer;

            for (int column = left; column <= right; column++) {
                elements.add(matrix.get(top).get(column));
            }

            for (int row = top + 1; row <= bottom; row++) {
                elements.add(matrix.get(row).get(right));
            }

            for (int column = right - 1; column >= left; column--) {
                elements.add(matrix.get(bottom).get(column));
            }

            for (int row = bottom - 1; row > top; row--) {
                elements.add(matrix.get(row).get(left));
            }

            int size = elements.size();
            int shift = r % size;

            int index = shift;

            for (int column = left; column <= right; column++) {

                matrix.get(top).set(
                    column,
                    elements.get(index)
                );

                index = (index + 1) % size;
            }

            for (int row = top + 1; row <= bottom; row++) {

                matrix.get(row).set(
                    right,
                    elements.get(index)
                );

                index = (index + 1) % size;
            }

            for (int column = right - 1; column >= left; column--) {

                matrix.get(bottom).set(
                    column,
                    elements.get(index)
                );

                index = (index + 1) % size;
            }

            for (int row = bottom - 1; row > top; row--) {

                matrix.get(row).set(
                    left,
                    elements.get(index)
                );

                index = (index + 1) % size;
            }
        }
    }
}
