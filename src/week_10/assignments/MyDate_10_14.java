package week_10.assignments;

import java.util.GregorianCalendar;

public class MyDate_10_14 {
    private int year;
    private int month;
    private int day;

    public MyDate_10_14() {
        this(System.currentTimeMillis());
    }

    public MyDate_10_14(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate_10_14(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);


    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "year : " + getYear() + " month : " + getMonth() + " day : " + getDay();
    }
}
