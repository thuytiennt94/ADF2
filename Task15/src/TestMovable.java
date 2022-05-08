public class TestMovable {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(1,2);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        System.out.println("--------------");
        Movable m2 = new MovablePoint(4,6);
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
    }
}
