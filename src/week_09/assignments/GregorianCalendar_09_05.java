package week_09.assignments;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class GregorianCalendar_09_05 {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Current year  : " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month : " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day   : " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println();
        System.out.println("=======================");
        System.out.println("   After set time");
        System.out.println("=======================");
        System.out.println();


        calendar.setTimeInMillis(1234567898765L);

        System.out.println("Current year  : " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month : " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day   : " + calendar.get(GregorianCalendar.DAY_OF_MONTH));


    }
}
