package day170701.lesson;

/**
 * Created by Duelist on 01.07.2017.
 */
public class MatrixProcessing {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
        };

        int k = count(matrix, 10);
        System.out.println(k);
    }

    private static int count(int[][] matrix, int max) {
        int r = 0;
        int s = 0;

        OUTER: for (int i = 0; i < matrix.length; i++) {
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
}
