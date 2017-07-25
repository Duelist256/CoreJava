package day170724.homework;

public class TakeCare {
    public static void main(String[] args) {

        Pet pet = new Cat();

        System.out.println("Cat");
        pet.play();
        System.out.println("---");
        pet.feed();
        System.out.println("---");
        pet.feed();
        System.out.println("---");
        pet.play();
        System.out.println("---");
        pet.play();


        pet = new Rat();

        System.out.println("\nRat");
        pet.play();
        System.out.println("---");
        pet.feed();
        System.out.println("---");
        pet.feed();
        System.out.println("---");
        pet.play();
        System.out.println("---");
        pet.play();
    }
}
