package codingbat.recursion1;

public class ChangePi {

    public static String changePi(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() > 1 && str.substring(0, 2).equals("pi")) {
            return 3.14 + changePi(str.substring(2, str.length()));
        } else {
            return str.charAt(0) + changePi(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
        System.out.println(changePi("pipi"));
        System.out.println(changePi("pip"));
    }
}
