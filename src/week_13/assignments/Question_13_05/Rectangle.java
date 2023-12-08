package week_13.assignments.Question_13_05;



public class Rectangle extends GeometricObject {

    private double width;
    private double height;



    public Rectangle(double width, double height, boolean filled, String color) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nheight : " + height + "\nwidth : " + width +
                "\narea : " + getArea() + "\nperimeter : " + getPerimeter();
    }
}
