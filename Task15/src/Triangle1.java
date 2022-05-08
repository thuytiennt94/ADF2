public class Triangle1 implements Shape1 {
    private int base, height;
    public Triangle1(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle1[" + "base=" + base + ", height=" + height + ']';
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
