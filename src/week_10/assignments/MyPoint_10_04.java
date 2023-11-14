package week_10.assignments;

public class MyPoint_10_04 {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint_10_04() {
        this(0, 0);
    }

    public MyPoint_10_04(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint_10_04 myPoint) {
        return Math.sqrt(Math.pow(this.getX() - myPoint.getX() , 2) + Math.pow(this.getY() - myPoint.getY() , 2));
    }

    public double distance(int x, int y) {
        return distance(new MyPoint_10_04(x, y));
    }


}
