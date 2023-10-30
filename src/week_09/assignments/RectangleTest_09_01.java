package week_09.assignments;

public class RectangleTest_09_01 {
    public static void main(String[] args) {

        Rectangle_09_01 rectangle1 = new Rectangle_09_01(4, 40);

        System.out.println("========== Rectangle 1 ==========");
        System.out.println("_________________________________");
        System.out.println(" Width     : " + rectangle1.width);
        System.out.println(" Length    : " + rectangle1.length);
        System.out.println(" Area      : " + rectangle1.getArea());
        System.out.println(" Perimeter : " + rectangle1.getPerimeter());


        System.out.println();
        System.out.println();


        Rectangle_09_01 rectangle2 = new Rectangle_09_01(3.5 , 35.9);

        System.out.println("========== Rectangle 2 ==========");
        System.out.println("_________________________________");
        System.out.println(" Width     :" + rectangle2.width);
        System.out.println(" Length    : " + rectangle2.length);
        System.out.println(" Area      : " + rectangle2.getArea());
        System.out.println(" Perimeter : " + rectangle2.getPerimeter());

    }
}
