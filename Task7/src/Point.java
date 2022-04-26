public class Point {
    private int x, y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point = ("  + x + "," + y +')';
    }
    public int getXY(){}
}
