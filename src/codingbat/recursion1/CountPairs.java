package codingbat.recursion1;

public class CountPairs {

    public static int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        } else if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1, str.length()));
        } else {
            return countPairs(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(countPairs("axa"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axbx"));
    }
}
