package week_13.assignments;

import java.util.Date;

public abstract class GeometricObject {
    private String color;

    private boolean isFilled;

    private Date dateCreated;

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
}
