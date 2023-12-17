package week_13.assignments.Question_13_12;


import week_13.assignments.Question_13_05.GeometricObject;

public class Circle extends GeometricObject {

    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nradius : " + radius + "\narea : " + getArea() +
                "\nperimeter : " + getPerimeter();
    }
}
