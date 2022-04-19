public class TestObjectReferences {
    public static void main(String[] args) {
        Rectangle1 objRec1 = new Rectangle1(10, 20);
        Rectangle1 objRec2;
        objRec2 = objRec1;
        System.out.println("\nRectangle1 Details");
        System.out.println("====================");
        objRec1.displayDimesions();
        System.out.println("\nRectangle2 Details");
        System.out.println("====================");
        objRec2.displayDimesions();
    }

}
