package day170717.exercise;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Duelist on 17.07.2017.
 */
public class UseInstruments {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.classOfInstrument();

        Cymbals cymbals = new Cymbals();
        cymbals.play();
        cymbals.classOfInstrument();

        Drums drums = new Drums();
        drums.classOfInstrument();
        drums.play();

        Trumpet trumpet = new Trumpet();
        trumpet.play();
        trumpet.classOfInstrument();

        System.out.println();

        List<Instruments> instruments = Arrays.asList(new Guitar(), new Viola(), new Drums());
        for (Instruments instrument : instruments) {
            instrument.classOfInstrument();
            instrument.play();
        }
    }
}
