package day170719.interfaces.part2;

/**
 * Created by Duelist on 19.07.2017.
 */
public class Violin extends Instrument {
    @Override
    public void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
