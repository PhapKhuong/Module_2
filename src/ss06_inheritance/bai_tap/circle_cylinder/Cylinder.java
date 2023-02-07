package ss06_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder () {
        this(1, "white", "no fill", 1);
    }

    public Cylinder (double radius, String border, String filler, double height) {
        super (radius, border, filler);
        this.height = height;
    }

    public double getRadius () {
        return super.getRadius();
    }

    public void setRadius (double newRadius) {
        super.setRadius(newRadius);
    }

    public String getBorder () {
        return super.getBorder();
    }

    public void setBorder (String newBorder) {
        super.setBorder(newBorder);
    }

    public String getFiller () {
        return super.getFiller();
    }

    public void setFiller (String newFiller) {
        super.setFiller(newFiller);
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double newHeight) {
        this.height = newHeight;
    }

    public double getVolume () {
        return height * super.getArea();
    }
}
