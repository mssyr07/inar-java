package week_09.assignments;

public class Fans_09_08 {

    final static int SLOW = 1;

    final static int MEDIUM = 2;

    final static int FAST = 3;

    private int speed;

    private boolean isOn;

    private double radius;

    String color;


    public boolean getIsOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;

    }

    public String getSpeed() {
        String spd = " ";

        switch (speed) {
            case SLOW:
                spd = "SLOW";
                break;
            case MEDIUM:
                spd = "MEDIUM";
                break;
            case FAST:
                spd = "FAST";
                break;

        }
        return spd;
    }

    public String getColor() {
        return color;
    }

    public void setOn() {
        isOn = true;

    }

    public void setOff() {
        isOn = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public Fans_09_08() {

        speed = SLOW;
        isOn = false;
        radius = 5;
        color = "blue";

    }


    @Override
    public String toString() {
        if (isOn == true) {
            return "Fan Speed : " + getSpeed() + " , " + "color : " + getColor() + " , " + "radius : " + getRadius();
        }
        else {
            return "Fan color: " + color + ", radius: " + radius +
                    " fan is off;";
        }
    }
}
