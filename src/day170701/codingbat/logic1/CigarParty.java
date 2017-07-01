package day170701.codingbat.logic1;

/**
 * Created by Duelist on 01.07.2017.
 */
public class CigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend && cigars >= 40)
                || (cigars >= 40 && cigars <= 60);
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
    }
}
