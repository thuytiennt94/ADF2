public class TestShape {
    public static void main(String[] args) {
        Share s1 = new Rectangle("red", 5, 8);
        System.out.println(s1);
        System.out.println("area = " + s1.getArea());
        System.out.println("---------------");
        Share s2 = new Triangle("black", 3,10);
        System.out.println(s2);
        System.out.println("area = " + s2.getArea());
    }
}
