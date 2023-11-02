package week_09.assignments;

public class Stopwatch_09_06 {

    // data fields //

    private long startTime;

    private long endTime;


    // non arg constructor that assigns the current time to the variable startTime  //
    public Stopwatch_09_06() {
        startTime = System.currentTimeMillis();
    }


    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }


    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }


    // getter methods //

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
