package Shape;

public class Shape {
    private String Color;
    private boolean Filled;

    /**
     * constuctor
     */
    public Shape(){
        this.Color = "red";
        this.Filled = true;
    }
    public Shape(String color, boolean filled){
        this.Color = color;
        this.Filled = filled;
    }

    /**
     *  getter/setter
      */

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        this.Filled = filled;
    }

    /**
     *  Ghi đè phương thức toString
      */


    public String toString(){
        return "hình có màu: " + this.getColor();
    }

}
