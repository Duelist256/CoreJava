package day170719.interfaces.part1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Duelist on 19.07.2017.
 */
public class CleaningBot {
    public static void main(String[] args) {
        List<Object> instruments = Arrays.asList(new Table(), new Chair(), new Violin(), new Drum());
        for (Object obj : instruments) {
            if (obj instanceof Instrument) {
                ((Instrument) obj).clean();
            }

            if (obj instanceof Furniture) {
                ((Furniture) obj).clean();
            }
        }
    }
}
