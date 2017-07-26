package day170724.homework;

public class Rat implements Pet {

    private Brain brain = new Hungry();

    @Override
    public void feed() {
        brain.feed();

        if (brain instanceof Hungry) {
            brain = new Fed();
        }
    }

    @Override
    public void play() {
        brain.play();

        if (brain instanceof Fed) {
            brain = new Hungry();
        }
    }
}

class Fed implements Brain {

    @Override
    public void feed() {
        wiggle();
        sniff();
        wiggle();
    }

    @Override
    public void play() {
        wiggle();
        squeak();
        wiggle();
    }

    private void squeak() {
        System.out.println("squeaks");
    }

    private void sniff() {
        System.out.println("sniffs");
    }

    private void wiggle() {
        System.out.println("wiggles");
    }
}

class Hungry implements Brain {

    @Override
    public void feed() {
        squeak();
        sniff();
        eat();
    }

    @Override
    public void play() {
        squeak();
        bite();
        squeak();
    }

    private void bite() {
        System.out.println("bites");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void squeak() {
        System.out.println("squeaks");
    }

    private void sniff() {
        System.out.println("sniffs");
    }
}