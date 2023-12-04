package access_modifier_static_method_static_property.bai1;

public class TestCircle {
    public static void main(String[] args) {
        Bai1 circle = new Bai1(1,"black");
        System.out.println("radius"+circle.getRadius());
        System.out.println("color"+circle.getColor());
    }
}
