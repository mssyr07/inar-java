package week_13.assignments.Question_13_10;

public class Question_13_10 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 5, true, "pink");
        Rectangle r2 = new Rectangle(5, 2, true, "red");
        Rectangle r3 = new Rectangle(3, 5, false, "blue");


        System.out.println("Rectangle 1 is " + (r1.equals(r2) ? "" : " not ") + " equal to Rectangle 2 ");
        System.out.println("Rectangle 1 is " + (r1.equals(r3) ? "" : " not ") + " equal to Rectangle 3 ");
        System.out.println("Rectangle 2 is " + (r2.equals(r3) ? "" : " not ") + " equal to Rectangle 3 ");
    }
}
