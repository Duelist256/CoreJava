package codingbat.recursion1;

public class CountAbc {

    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        } else {
            String sub = str.substring(0, 3);
            if (sub.equals("abc") || sub.equals("aba")) {
                return 1 + countAbc(str.substring(2, str.length()));
            } else {
                return countAbc(str.substring(1, str.length()));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
    }
}
