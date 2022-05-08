public class TestShape1 {
    public static void main(String[] args) {
        Shape1 s1 = new Rectangle1(15,4);
        System.out.println(s1);
        System.out.println("area = "+s1.getArea());
        System.out.println("--------------------");
        Shape1 s2 = new Triangle1(24,7);
        System.out.println(s2);
        System.out.println("area = "+s2.getArea());
    }
}
