package day170816.lesson;

public class Exercise {
    public static void main(String[] args) {
        int[][] array = {
                {5, 1, 0, 5},
                {1, 5, 2, 1},
                {0, 2, 5, 3},
                {5, 1, 3, 5},};

        System.out.println(isSymmetric(array));
    }

    // 0 1 2 4
    // 1 0 1 4
    // 2 1 0 2
    // 4 4 2 0
    private static boolean isSymmetric(int[][] array) {
        if (array == null || array.length < 1) {
            return false;
        }

        // checking if non-quadratic
        int totalElements = 0;
        for (int i = 0; i < array.length; i++) {
            totalElements += array[i].length;
        }

        if (array.length * array.length != totalElements) {
            return false;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
