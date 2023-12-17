package week_13.assignments.Question_13_11;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;

    private boolean isFilled;

    private Date dateCreated;

    public GeometricObject() {
        this("default", false);
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        this.dateCreated = new Date();

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
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else return 0;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
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
