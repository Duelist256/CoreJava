package day170717.exercise;

/**
 * Created by Duelist on 17.07.2017.
 */
abstract class Percussion extends Instruments {
    @Override
    protected void classOfInstrument() {
        System.out.println(getClass().getSimpleName() + " is percussion");
    }
}
