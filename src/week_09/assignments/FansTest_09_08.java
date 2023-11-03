package week_09.assignments;

public class FansTest_09_08 {
    public static void main(String[] args) {

        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;


        Fans_09_08 fan1 = new Fans_09_08();
        Fans_09_08 fan2 = new Fans_09_08();

        // Assign maximum speed, radius 10, color yellow,
        // and turn it on to the first object
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn();

        // Assign medium speed, radius 5, color blue,
        // and turn it off to the second object
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOff();

        // Display the objects by invoking their toString method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
