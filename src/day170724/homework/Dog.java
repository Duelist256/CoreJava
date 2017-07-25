package day170724.homework;

public class Dog implements Pet {

    Brain brain = new Hungry();

    @Override
    public void feed() {
        brain.feed();
    }

    @Override
    public void play() {
        brain.play();
    }

    class Fed implements Brain {

        @Override
        public void feed() {
            wiggle();
            wiggle();
        }

        @Override
        public void play() {
            bark();
            wiggle();
            jump();
            jump();
            brain = new Hungry();
        }
    }


    class Hungry implements Brain {

        @Override
        public void feed() {
            bark();
            wiggle();
            eat();
            bark();
            brain = new Fed();
        }

        @Override
        public void play() {
            bark();
            bite();
            bark();
        }
    }

    private void bite() {
        System.out.println("bites");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void wiggle() {
        System.out.println("wiggles");
    }

    private void bark() {
        System.out.println("barks");
    }

    private void jump() {
        System.out.println("jumps");
    }


}
