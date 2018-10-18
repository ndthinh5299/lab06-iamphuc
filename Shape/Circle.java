package Shape;

public class Circle extends Shape {
    private Point a;
    private double radius;
    private final double PI = Math.PI;

    /**
     * constructor
     */


    public Circle(Point a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Circle(String color, boolean filled, Point a, double radius) {
        super(color, filled);
        this.a = a;
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * getter/setter
      */

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
    /**
     * Phương thức di chuyển hình tròn
     */
    public void moveTo(double x, double y){
        a.move(x, y);
    }


    /**
     * Ghi đè phương thức toString
      */

    public String toString() {
        return "Hình tròn có bán kính là: " + this.getRadius()
                + " \t Tâm là:  " + a;
    }
}
