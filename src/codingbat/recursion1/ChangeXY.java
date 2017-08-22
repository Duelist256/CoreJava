package codingbat.recursion1;

public class ChangeXY {

    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return 'y' + changeXY(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + changeXY(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixhix"));
    }
}
