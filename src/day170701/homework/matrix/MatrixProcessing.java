package day170701.homework.matrix;

/**
 * Created by Duelist on 01.07.2017.
 */
public class MatrixProcessing {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {3, -4, 5},
                {6, 7, 8},
                {2, 7, -8},
                {7, 4, 3},
        };

        printNonNegative(matrix);
    }

    private static int count(int[][] matrix, int max) {
        int r = 0;
        int s = 0;

        OUTER:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                r++;
                s += matrix[i][j];
                if (s > max) {
                    break OUTER;
                }
            }
        }
        return r;
    }

    private static void printNonNegative(int[][] matrix) {
        OUTER:
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int sum = 0;
            for (int j = 0; j < row.length; j++) {
                if (row[j] < 0) {
                    continue OUTER;
                }
                sum += row[j];
            }
            System.out.println("sum at " + i + " = " + sum);
        }
    }
}
