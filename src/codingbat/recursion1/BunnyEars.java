package codingbat.recursion1;

public class BunnyEars {

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
    }
}
