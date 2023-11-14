package week_10.assignments;

public class TestMyPoint_10_04 {
    public static void main(String[] args) {

        MyPoint_10_04 myPoint1 = new MyPoint_10_04();
        MyPoint_10_04 myPoint2 = new MyPoint_10_04(10, 30.5);

        System.out.println("The distance betwwer ( " + myPoint1.getX() + " , " + myPoint1.getY() + " ) and ( "
                + myPoint2.getX() + " , " + myPoint2.getY() + " ) is : "
                + myPoint1.distance(myPoint2));


    }
}
