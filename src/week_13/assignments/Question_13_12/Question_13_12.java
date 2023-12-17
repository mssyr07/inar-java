package week_13.assignments.Question_13_12;

public class Question_13_12 {
    public static void main(String[] args) {

        GeometricObject[] objects;
        objects = new GeometricObject[]{new Circle("Yellow", true, 6),
                new Circle("Dark Blue", false, 7),
                new Rectangle(10, 20, true, "White"),
                new Rectangle(20, 10, false, "Black")};

        System.out.printf("Total area of Geometric Objects: %.2f ", sumArea(objects));

    }

    public static double sumArea(GeometricObject[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getArea();
        }
        return sum;
    }
}
