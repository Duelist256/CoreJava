package day170825;

import java.util.Optional;

public class MoreOptionalExamples {
    public static void main(String[] args) {
        System.out.println(hasThreeDigits(null));
        System.out.println(hasThreeDigits(0));
        System.out.println(hasThreeDigits(99));
        System.out.println(hasThreeDigits(100));
        System.out.println(hasThreeDigits(1000));
        System.out.println(hasThreeDigits(-100));
    }

//    static public boolean hasThreeDigits(Integer n) {
//        if (n == null) {
//            return false;
//        }
//
//        return Integer.toString(n).length() == 3;
//    }

    static public boolean hasThreeDigits(Integer n) {
        return Optional.ofNullable(n)
                .map(x -> Integer.toString(x))
                .filter(s -> s.length() == 3 || (s.length() == 4 && s.charAt(0) == '-'))
                .isPresent();
    }
}
