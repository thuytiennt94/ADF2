package session6;
public class CS7_StaticMembers {
    public static int staticCounter = 0;
    int instanceCounter= 0;
    static {
        System.out.println("I am a staticblock");
    }
    public static void staticMethor(){
        System.out.println("I am a staticmethod");
    }
    public void displayCount(){
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter is: " + staticCounter);
        System.out.println("Instance counter is: " + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("I am the main method");
        CS7_StaticMembers.staticMethor();
        CS7_StaticMembers objStatic1 = new CS7_StaticMembers();
        objStatic1.displayCount();
        CS7_StaticMembers objStatic2 = new CS7_StaticMembers();
        objStatic2.displayCount();
        CS7_StaticMembers objStatic3 = new CS7_StaticMembers();
        objStatic3.displayCount();
    }
}
