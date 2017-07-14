package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 15.07.2017.
 */
public class NotReplace {

    // TODO should be simplified
    private static String notReplace(String str) {

        if (str.length() < 2) {
            return str;
        }

        if (str.length() == 2) {
            if (str.equals("is")) {
                return "is not";
            } else {
                return str;
            }
        }


        StringBuilder newString = new StringBuilder();
        int i = 0;
        // check first substring
        if (str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i + 2))) {
            newString.append("is not");
            i = 2;
        } else {
            newString.append(str.charAt(i));
            i = 1;
        }

        while (i < str.length() - 2) {
            if (!Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))
                    && str.substring(i, i + 2).equals("is")) {
                newString.append("is not");
                i++;
            } else {
                newString.append(str.charAt(i));
            }
            i++;
        }

        // check last substring
        if (str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1))) {
            newString.append("is not");
        } else {
            newString.append(str.substring(i, i + 2));
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
        System.out.println(notReplace("This is isabell")); // This is not isabell
    }
}
