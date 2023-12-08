package week_13.assignments.Question_13_05;

public class Question_13_05 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(20, 15, true, "blue");
        Rectangle r2 = new Rectangle(15, 2, false, "red");

        System.out.println("The larger rectangle is : " + (Rectangle.max(r1, r2)));

        Circle c1 = new Circle("Yellow", true, 5);
        Circle c2 = new Circle("Green", false, 4);

        System.out.println("The larger Circle is : " + Circle.max(c1, c2));
    }

}
