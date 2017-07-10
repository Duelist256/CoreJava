package day170710.lesson.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Duelist on 10.07.2017.
 */
public class Examples {

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = Calendar.getInstance().getTime();
        System.out.println(date2);

        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

    }
}
