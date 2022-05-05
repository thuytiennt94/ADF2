public class Shape {
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public double getArea(){
        System.out.println("Shape unkrown! Cannot computer area!");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape: color = " +  color +  '.';
    }
}
