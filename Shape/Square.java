package Shape;

public class Square extends Rectangle {

    public Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    public Square(String color, boolean filled, Point a, Point b, Point c, Point d) {
        super(color, filled, a, b, c, d);
    }
    public String toString(){
        return "Hinnfh vuông có 4 đỉnh là: " + super.getA() + super.getB() + super.getC() + super.getD()
                + "\t Màu sắc là: " + super.getColor();
    }
}
