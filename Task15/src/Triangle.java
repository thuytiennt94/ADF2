public class Triangle extends Share{
    private int base, height;
    public Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", height =" + height + " , " + super.toString() + '}';
    }

    @Override
    public double getArea() {
        return height * base * 0.5;
    }
}
