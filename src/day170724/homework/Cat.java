package day170724.homework;

public class Cat implements Pet {
    Brain brain = new Cat.Hungry();

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
            meow();
        }

        @Override
        public void play() {
            wiggle();
            scratch();
            wiggle();
            brain = new Cat.Hungry();
        }
    }


    class Hungry implements Brain {

        @Override
        public void feed() {
            meow();
            eat();
            brain = new Cat.Fed();
        }

        @Override
        public void play() {
            scratch();
            bite();
            bite();
            scratch();
        }
    }

    private void bite() {
        System.out.println("bites");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void scratch() {
        System.out.println("scratches");
    }

    private void wiggle() {
        System.out.println("wiggles");
    }

    private void meow() {
        System.out.println("meows");
    }
}