package day170701.codingbat.logic1;

/**
 * Created by Duelist on 01.07.2017.
 */
public class DateFashion {
    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));
    }
}
