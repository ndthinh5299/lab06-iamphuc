package Lab06;

import Shape.Circle;
import Shape.Shape;

import java.util.ArrayList;

public class Diagram {
  private ArrayList<Layer> layers;

    /**
     * constructor
     */
    public  Diagram(){
        layers  = new ArrayList<Layer>();

    }
    public Diagram(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    /**
     * geter/seter
     * @return
     */
    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers){
        this.layers = layers;
    }

    /**
     * thêm Layer
     */
    public void addLayer( Layer layer){
        this.layers.add(layer);

    }
    /**
     * xóa tất cả các hình tròn
     */
    public void removeAllCircle(){
       for(int i=0; i< layers.size(); i++){
           layers.get(i).removeAllCircle();
       }
    }

    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        String s = "Diagram: \n";
        for(Layer layer : layers ){
            s = s + "\t" + layer;
        }
        return s;
    }
}
