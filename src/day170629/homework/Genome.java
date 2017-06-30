package day170629.homework;


/**
 * Created by Duelist on 29.06.2017.
 **/
public class Genome {
    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(21);

        for (byte b: data) {
            System.out.print(((char) b));
        }

        System.out.println();
        System.out.println("\nTotal founded: " + compare(data, 3));
    }

    public static int compare(byte[] data, int length) {
        boolean isEqual = false;
        int counter = 0;
        for (int i = 0; i < data.length - length; i++) {
            TAG:
            for (int j = i + 1; j < data.length - length; j++) {
                if (isEqual) {
                    counter++;
                    System.out.println(i + " and " + (j-1));
                }

                for (int k = 0; k < length; k++) {
                    if (data[i + k] == data[j + k]) {
                        isEqual = true;
                    } else {
                        isEqual = false;
                        continue TAG;
                    }
                }
            }
        }
        return counter;
    }
}
