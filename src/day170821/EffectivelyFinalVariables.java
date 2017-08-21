package day170821;

public class EffectivelyFinalVariables {
    public static void main(String[] args) {
        int x = 10;

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(x);
            }
        };

        new Thread(r).start();

    }
}
