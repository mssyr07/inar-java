package week_13.assignments.Question_13_09;

public class Question_13_09 {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Red", true, 5);
        Circle circle2 = new Circle("Purple", false, 6);
        Circle circle3 = new Circle("Yellow", true, 6);

        System.out.println("Radius of circle 1 is : " + circle1.getRadius());
        System.out.println("Radius of circle 2 is : " + circle2.getRadius());
        System.out.println("Radius of circle 3 is : " + circle3.getRadius());


        System.out.println("circle 1 is " + (circle1.equals(circle2) ? "" : " not ") + " equal to circle 2 ");
        System.out.println("circle 1 is " + (circle1.equals(circle3) ? "" : " not ") + " equal to circle 3 ");
        System.out.println("circle 2 is " + (circle2.equals(circle3) ? "" : " not ") + " equal to circle 3 ");
    }
}
