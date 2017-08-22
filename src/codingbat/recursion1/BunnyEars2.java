package codingbat.recursion1;

public class BunnyEars2 {

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 1) {
            return 2 + bunnyEars2(bunnies - 1);
        } else {
            return 3 + bunnyEars2(bunnies - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(bunnyEars2(0));
        System.out.println(bunnyEars2(1));
        System.out.println(bunnyEars2(2));
    }
}
