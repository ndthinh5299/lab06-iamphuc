package Lab06;

import Shape.Shape;
import Shape.Triangle;import Shape.Circle;
import sun.security.provider.SHA;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> shapes;

    /**
     * constructor
     *
     * shapes
     */
    public Layer() {
    shapes = new ArrayList<Shape>();
    }

    public Layer(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * getter/ setter
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * thêm 1 shape mới
     *
     * @param shape
     */
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * thêm nhiều shape
     *
     * @param shapes
     */
    public void addShapes(ArrayList<Shape> shapes) {
        this.shapes.addAll(shapes);
    }

    /**
     * xóa 1 shape
     *
     * @param shape
     */
    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }

    /**
     * xóa tất cả các hình tam giác
     */
    public void removeAllTriangle() {
        for(int i = 0; i< shapes.size(); i++){
            if(shapes.get(i) instanceof Triangle){
                shapes.remove(i);
            }
        }
    }

    /**
     * xóa tất cả các hình tròn
     */
    public void removeAllCircle() {
        for(int i = 0; i< shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * Ghi đè phương thức toString
     */
    public String toString() {
        String s = "Layer:";

        for (Shape shape : shapes) {
           s = s + " \n * " +  shape;
        }
        return s ;
    }
}





