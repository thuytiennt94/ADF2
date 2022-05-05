public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 5, 6);
        System.out.println(s1);
        System.out.println("Area = " + s1.getArea());
        //
        Shape s2 = new Triangle("green", 5, 8);
        System.out.println(s2);
        System.out.println("Area = " + s2.getArea());
    }
}
