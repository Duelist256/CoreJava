package day170901.enumexamples;

public enum Singleton {
    INSTANCE;

    private int state;

    Singleton() {
    }

    public void change() {
        state++;
    }

    public int getState() {
        return state;
    }
}
