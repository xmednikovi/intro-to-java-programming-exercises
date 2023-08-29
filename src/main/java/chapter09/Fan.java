package chapter09;

public class Fan {

    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isOn()){
            return String.format("Color: %s\nRadius is: %5.1f\nSpeed is: %d\nFan is on\n",
                    this.color, this.radius, this.speed);
        } else {
            return String.format("Color: %s\nRadius is: %5.1f\nSpeed is: %d\nFan is off\n",
                    this.color, this.radius, this.speed);
        }
    }
}
