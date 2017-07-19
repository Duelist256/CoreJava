package day170719.swap;

/**
 * Created by Duelist on 19.07.2017.
 */
public class SwapExamples {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int[] arr = {a, b};
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        swap(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
