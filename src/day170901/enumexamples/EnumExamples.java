package day170901.enumexamples;

public class EnumExamples {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            System.out.println(season + " " + season.ordinal());
        }

        Seasons season = Seasons.valueOf("AUTUMN");
        System.out.println(season.getTemperature());

        switch (season) {
            case WINTER:
                break;
            case SPRING:
                break;
            case SUMMER:
                break;
            case AUTUMN:
                System.out.println("Hello");
                break;
            default:
                break;
        }

        Singleton.INSTANCE.change();
        System.out.println(Singleton.INSTANCE.getState());
    }
}