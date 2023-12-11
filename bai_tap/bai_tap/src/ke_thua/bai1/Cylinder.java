package ke_thua.bai1;

public class Cylinder extends Circle{
    private int height;

    public Cylinder() {
    }
    public Cylinder(int height, String color, int radius){
        super(radius,color);
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cylinder(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +",radius ="+getRadius()+",color ="+getColor()+
                '}';
    }
}
