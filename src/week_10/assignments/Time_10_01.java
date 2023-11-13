package week_10.assignments;

public class Time_10_01 {
    private long second;
    private long minute;
    private long hour;

    public Time_10_01() {
        this(0);
    }

    public Time_10_01(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time_10_01(long second, long minute, long hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public long getSecond() {
        return second;
    }

    public long getMinute() {
        return minute;
    }

    public long getHour() {
        return hour;
    }

    public void setTime(long elapsedTime) {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;

        if (elapsedTime > 0) {
            totalSeconds = elapsedTime / 1000;
            second = totalSeconds % 60;
            totalMinutes = totalSeconds / 60;
            minute = totalMinutes % 60;
            totalHours = totalMinutes / 60;
            hour = totalHours % 24;
        }
    }
}
