package day170719.interfaces.part2;

/**
 * Created by Duelist on 19.07.2017.
 */
public class Chair extends Furniture {
    @Override
    public void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
