package ke_thua.bai2;

public class Point2D {
    private float x=1;
    private float y=2;

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

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}'+"xy="+getXY();
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public Point2D() {
    }
}
