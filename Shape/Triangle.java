package Shape;

public class Triangle extends Shape {
    private Point a,b,c;

    /**
     * constuctor
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, boolean filled, Point a, Point b, Point c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
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

    /**
     * Phương thức di chuyển hình tam giac
     */
    public void  move(double x, double y){
        a.move(x,y);
        b.move(x,y);
        c.move(x,y);
    }
    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return "Hình tam giác có 3 đỉnh: " + a+ b +c
                +"\t Màu sắc: " + super.getColor();
    }
}
