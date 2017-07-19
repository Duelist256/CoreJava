package day170719.interfaces.part2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Duelist on 19.07.2017.
 */
public class CleaningBot {
    public static void main(String[] args) {
        List<Cleanable> roomObjects = Arrays.asList(new Table(), new Chair(), new Violin(), new Drum());
        for (Cleanable obj : roomObjects) {
            obj.clean();
        }
    }
}
