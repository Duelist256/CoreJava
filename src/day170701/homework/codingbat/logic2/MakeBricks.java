package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 01.07.2017.
 */
public class MakeBricks {
    private static boolean makeBricks(int small, int big, int goal) {
        int totalInches = small + big * 5;
        return totalInches >= goal && goal % 5 <= small;

    }


    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(makeBricks(3, 2, 9));
        System.out.println(makeBricks(5, 2, 9));
    }
}
