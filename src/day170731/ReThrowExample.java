package day170731;

public class ReThrowExample {

    public static void main(String[] args) {

        try {
            buildHouse();
        } catch (Exception e) {
            Exception c = e;
            while (c != null) {
                c.printStackTrace();
                c = (Exception) c.getCause();
            }
        }

    }

    private static void buildHouse() {
        try {
            buildBasement();
        } catch (Exception e) {
            throw new ProblemWithTechnique(e);
        }
    }

    private static void buildBasement() {
        try {
            digPit();
        } catch (Exception e) {
            throw new NoInstruments(e);
        }
    }

    private static void digPit() {
        throw new NoShovel();
    }

}
