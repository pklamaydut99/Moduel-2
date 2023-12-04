package access_modifier_static_method_static_property.bai1;

public class Bai1 {
    private double radius;
    private String color;

    public double getArea(){
        return radius*radius;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public Bai1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Bai1(){
        radius = 1.0;
        color ="red";
    }
}
