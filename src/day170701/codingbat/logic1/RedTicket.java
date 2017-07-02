package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class RedTicket {
    public static int redTicket(int a, int b, int c) {
        if ((a >= 0 && a <= 2) && (b >= 0 && b <= 2) && (c >= 0 && c <= 2)) {
            if (a == b && b == c) {
                if (c == 2) {
                    return 10;
                }
                return 5;
            }
            if (b != a && c != a) {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2));
        System.out.println(redTicket(2, 2, 1));
        System.out.println(redTicket(0, 0, 0));
    }
}
