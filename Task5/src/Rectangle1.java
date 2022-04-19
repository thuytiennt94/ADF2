public class Rectangle1 {
    int width;
    int height;
    Rectangle1(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    Rectangle1(int wid, int heig){
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimesions(){
        System.out.println("Width: "+ width);
        System.out.println("Height: " + height);
    }
}
