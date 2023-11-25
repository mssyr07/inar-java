package week_12.assignments.Question_12_05;

public class TriangleWıthException {
    private double side1;
    private double side2;
    private double side3;

    public TriangleWıthException() {
        side1 = side2 = side3 = 1.0;
    }

    public TriangleWıthException(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double a = (side1 + side2 + side3) / 2;
        return Math.sqrt(a * (a - side1) * a * (a - side2) * a * (a - side3));
    }

    public double getPerimeter() {
        return side1 + side3 + side2;
    }

    @Override
    public String toString() {
        return "Triangle  : side 1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }


}
