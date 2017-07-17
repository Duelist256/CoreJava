package day170717.exercise;

/**
 * Created by Duelist on 17.07.2017.
 */
abstract class Instruments {
    protected abstract void makeSound();

    protected abstract void classOfInstrument();

    protected void play() {
        makeSound();
        makeSound();
        makeSound();
    }
}
