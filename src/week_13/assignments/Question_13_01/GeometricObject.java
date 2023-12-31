package week_13.assignments.Question_13_01;

import java.util.Date;

public abstract class GeometricObject implements Comparable<week_13.assignments.Question_13_05.GeometricObject> {
    private String color;

    private boolean isFilled;

    private Date dateCreated;

    public GeometricObject() {
        this("default", false);
    }

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;

    }

    public String getColor() {

        return color;
    }

    public boolean isFilled() {

        return isFilled;
    }

    public Date getDateCreated() {

        return dateCreated;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setFilled(boolean filled) {

        isFilled = filled;
    }

    public void setDateCreated(Date dateCreated) {

        this.dateCreated = dateCreated;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public int compareTo(week_13.assignments.Question_13_05.GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else return 0;
    }

    public static week_13.assignments.Question_13_05.GeometricObject max(week_13.assignments.Question_13_05.GeometricObject o1, week_13.assignments.Question_13_05.GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                ", dateCreated=" + dateCreated +
                '}';
}
}
