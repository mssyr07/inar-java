package week_13.assignments.Question_13_11;

import week_13.assignments.Question_13_05.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable, Comparable<GeometricObject> {

    private double side;

    public Octagon(String color, boolean isFilled, double side) {
        super(color, isFilled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2) * side * side);
    }

    @Override
    public double getPerimeter() {
        return side * 8;

    }

    public Object clone() throws CloneNotSupportedException {
        Octagon octagon = (Octagon) super.clone();
        return octagon;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        } else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
    }
}
