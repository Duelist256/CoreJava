package day170706.lesson;

/**
 * Created by Duelist on 06.07.2017.
 */
public class PrintlnConcatenationExamples {
    public static void main(String[] args) {
        String s1 = "2" + "3";
        String s2 = "23";
        String s3 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(stringBuilder.charAt(0));
    }
}
