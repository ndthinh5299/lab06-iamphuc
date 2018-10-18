package Shape;

public class Point {
    private double x;
    private double y;

    /**
     * constuctor
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getter/stter
     * @return
     */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void move(double x, double y){
        this.x = x + this.x;
        this.y = y + this.y;
    }

    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return( "( "+ x +  ";" + y + " )");
    }


}
