public class Rectangle extends Share{
    private int length, width;
     public Rectangle(String color, int width, int length){
         super(color);
         this.width = width;
         this.length = length;
     }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + " , " + super.toString() + '}';
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
