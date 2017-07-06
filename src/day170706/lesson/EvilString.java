package day170706.lesson;

/**
 * Created by Duelist on 06.07.2017.
 */
public class EvilString {

    final char[] value;
    private int length;
    private int offset;

    public EvilString(String valueSourse) {
        value = valueSourse.toCharArray();
        length = value.length;
    }

    private EvilString(char[] value, int offset, int length) {
        this.value = value;
        this.offset = offset;
        this.length = length;
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public EvilString subString(int begin, int end) {
        return new EvilString(value, begin, end - begin);
    }

    public static void main(String[] args) {
        String s = new String(new char[1_000_000]);

        EvilString es = new EvilString(s);

        EvilString word = es.subString(0, 10);
    }
}
