package week_10.assignments;

public class TestTime_10_01 {
    public static void main(String[] args) {

        Time_10_01 time_1 = new Time_10_01();
        Time_10_01 time_2 = new Time_10_01(555550000);


        System.out.println(time_1.getHour() + " " + time_1.getMinute() + " " + time_1.getSecond());
        System.out.println(time_2.getHour() + " " + time_2.getMinute() + " " + time_2.getSecond());


    }
}
