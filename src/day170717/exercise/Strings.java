package day170717.exercise;

/**
 * Created by Duelist on 17.07.2017.
 */
abstract class Strings extends Instruments {
    @Override
    protected void classOfInstrument() {
        System.out.println(getClass().getSimpleName() + " is strings");
    }
}
