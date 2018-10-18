package Shape;

import Lab06.Diagram;
import Lab06.Layer;

public class Main {
    public static void main(String[] args) {
        /**
         * tạo các đối tượng hình
         */
        Circle hinhTron1 = new Circle(new Point(0,1), 2);
        Circle hinhTron2 = new Circle(new Point(1,4), 3);

        Rectangle hinhChuNhat1 = new Rectangle
                        (new Point(2,1), new Point(-2,1), new Point(-2,-1), new Point(2,-1));

        Rectangle hinhVuong = new Square
                       (new Point(0,0), new Point(2,0), new Point(2,2), new Point(0,2));

        Triangle hinhTamGiac = new Triangle
                        (new Point(7,5), new Point(2,3), new Point(4,6));

        Diagram diagram  = new Diagram();
        Layer layer = new Layer();
/**
 * thêm layer vào Diagram
 */
        layer.addShape(hinhChuNhat1);
        layer.addShape(hinhTamGiac);
        layer.addShape(hinhTron1);
        layer.addShape(hinhTron2);
        layer.addShape(hinhVuong);

        System.out.println("Trước khi xóa hình tròn:");
        diagram.addLayer(layer);
        System.out.println(diagram);


        System.out.println("Sau khi xoa hinh tron:");
        diagram.removeAllCircle();
        System.out.println(diagram);

        System.out.println("*** Di chuyển các hình:");
        ((Rectangle) hinhChuNhat1).move(3,4);
        System.out.println(hinhChuNhat1);

    }
}
