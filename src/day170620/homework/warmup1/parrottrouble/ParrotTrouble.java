package day170620.homework.warmup1.parrottrouble;

/**
 * Created by Duelist on 25.06.2017.
 */
public class ParrotTrouble {
    private static boolean parrotTrouble(boolean talking, int hour) {
        return (hour < 7 || hour > 20) && talking;
    }

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }
}
