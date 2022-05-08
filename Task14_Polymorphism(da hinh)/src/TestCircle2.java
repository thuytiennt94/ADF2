public class TestCircle2 {
    public static void main(String[] args) {
        Circle c1=new Circle(1.1);
        Cylinder cyl=new Cylinder(2.2, 3.3);
        System.out.println(c1 instanceof Circle);
        System.out.println(c1 instanceof Cylinder);
        System.out.println(cyl instanceof Cylinder);
        System.out.println(cyl instanceof Circle);
        ///
        Circle c2=new Cylinder(4.4, 5.5);
        System.out.println(c2 instanceof Circle);
        System.out.println(c2 instanceof Cylinder);
    }
}
