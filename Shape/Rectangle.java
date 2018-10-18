package Shape;

public class Rectangle extends Shape {  
    private Point a,b,c,d;

    /**
     * constuctor
     */
    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle(String color, boolean filled, Point a, Point b, Point c, Point d) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * getter/setter
     * @return
     */
    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }
    /**
     * Phương thức di chuyển hình chữ nhật
     */
    public void move(double x, double y){
        a.move(x,y);
        b.move(x,y);
        c.move(x,y);
        d.move(x,y);
    }

    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return  "Hình chữ nhật có 4 đỉnh là: " + a+ b+ c+ d
                + "\t màu sắc: "  + super.getColor();

    }
}
