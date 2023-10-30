package week_09.assignments;

public class Rectangle_09_01 {

    double width = 1.0;
    double length = 1.0;


    public Rectangle_09_01() {
    }


    public Rectangle_09_01(double width, double length) {
        this.width = width;
        this.length = length;


    }


    public double getArea() {
        return (width * length);

    }

    public double getPerimeter() {
        return (2 * width * length);

    }

}
