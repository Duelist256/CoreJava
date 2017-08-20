package day170816.lesson;

public class Exercise {
    public static void main(String[] args) {
        int[][] array = {
                {5, 1, 2, 4},
                {0, 5, 2, 3},
                {0, 1, 5, 5},
                {0, 1, 0, 5},};

        boolean isSymmetric = isSymmetric(array);
        System.out.println(isSymmetric);
    }

    // 0 1 2 4
    // 1 0 1 4
    // 2 1 0 2
    // 4 4 2 0
    private static boolean isSymmetric(int[][] array) {
        if (array == null || array.length < 1) {
            return false;
        }

        int totalElements = 0;
        for (int i = 0; i < array.length; i++) {
            totalElements += array[i].length;
        }

        if (array.length * array.length != totalElements) {
            return false;
        }

        boolean hasDiagonal = false;

        int number = array[0][0];
        for (int i = 1; i < array.length; i++) {
            if (array[i][i] != number) {
                return false;
            }
            number = array[i][i];
        }

        hasDiagonal = true;

        // todo !!!

        return true;
    }
}
