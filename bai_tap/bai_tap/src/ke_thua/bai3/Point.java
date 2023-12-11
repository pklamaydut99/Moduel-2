package ke_thua.bai3;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float xy){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }
    public Point() {
        float x = 0.0f;
        float y = 0.0f;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
