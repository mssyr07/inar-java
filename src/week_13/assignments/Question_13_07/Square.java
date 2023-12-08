package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_05.GeometricObject;

public class Square extends GeometricObject implements Colorable {

    private double side;


    public Square(String color, boolean isFilled, double side) {
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
    public double getPerimeter() {
        return side * 4 ;
    }

    @Override
    public double getArea() {
        return side * side ;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide : " + getSide();
    }

    @Override
    public void howToColor() {
        System.out.println("All sides colored");
    }
}
