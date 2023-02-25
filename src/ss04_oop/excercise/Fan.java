package ss04_oop.excercise;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this(SLOW, false, 5, "blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void setOn(boolean newOn) {
        this.on = newOn;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        String str;
        if (this.getOn())
            str = "Speed: " + this.getSpeed() + "; Color: " + this.getColor() + "; Radius: " + this.getRadius() + "; fan is on.";
        else str = "Color: " + this.getColor() + "; Radius: " + this.getRadius() + "; fan is off.";
        return str;
    }
}