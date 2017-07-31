package day170731;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFinallyExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        try (FileInputStream fis = new FileInputStream("help.txt")){
            Thread.sleep(15000);
            int read = fis.read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("finish");
    }
}
