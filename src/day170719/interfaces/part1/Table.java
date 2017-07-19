package day170719.interfaces.part1;

/**
 * Created by Duelist on 19.07.2017.
 */
public class Table extends Furniture {
    @Override
    void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
