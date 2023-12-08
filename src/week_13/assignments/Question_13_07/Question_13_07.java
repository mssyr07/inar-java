package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_05.GeometricObject;

public class Question_13_07 {
    public static void main(String[] args) {

        GeometricObject square = new Square("Blue", false, 25);

        ((Square) square).howToColor();
    }
}
