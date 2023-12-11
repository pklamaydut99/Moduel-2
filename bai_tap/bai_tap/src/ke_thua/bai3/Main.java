package ke_thua.bai3;

public class Main {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint();
        MovablePoint p2 = new MovablePoint(1,2,1,2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.move());
        System.out.println(p2);
    }
}
