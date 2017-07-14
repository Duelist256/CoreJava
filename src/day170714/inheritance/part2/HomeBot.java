package day170714.inheritance.part2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Duelist on 14.07.2017.
 */
public class HomeBot {
    public static void main(String[] args) {
        List<Pet> pets = Arrays.asList(new Hamster(), new Dog(), new Cat());

        for (Pet pet : pets) {
            pet.feed();
        }

        Rat rat = new Rat();
        rat.feed();
    }
}
