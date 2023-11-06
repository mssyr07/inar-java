package week_09.assignments;

public class QuadraticEquitions_09_10 {

    private double a;
    private double b;
    private double c;

    public QuadraticEquitions_09_10(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscrimainant() {
        return (Math.pow(getB(), 2) - (4 * getA() * getC()));
    }

    public double getRoot1() {
        if (getDiscrimainant() < 0) {
            return 0;
        } else return ((-b) + (Math.sqrt(Math.pow(getB(), 2) - (4 * getA() * getC()))) / (2 * getA()));
    }


    public double getRoot2() {
        if (getDiscrimainant() < 0) {
            return 0;
        } else return ((-b) - (Math.sqrt(Math.pow(getB(), 2) - (4 * getA() * getC()))) / (2 * getA()));
    }

}
