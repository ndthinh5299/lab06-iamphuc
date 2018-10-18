package Shape;

public class Square extends Rectangle {

    public Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    /**
     * constuctor
     */
    public Square(String color, boolean filled, Point a, Point b, Point c, Point d) {
        super(color, filled, a, b, c, d);
    }

    /**
     * Ghi đè phương thức toString
     */
    public void moveTo(double x, double y){

        super.move(x,y);
    }
    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return "Hinnfh vuông có 4 đỉnh là: " + super.getA() + super.getB() + super.getC() + super.getD()
                + "\t Màu sắc là: " + super.getColor();
    }
}
