package codingbat.recursion1;

public class StrDist {

    public static int strDist(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        }
        
        while (!str.substring(str.length() - sub.length(), str.length()).equals(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        while (!str.substring(0, sub.length()).equals(sub)) {
            return strDist(str.substring(1), sub);
        }

        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }
}
