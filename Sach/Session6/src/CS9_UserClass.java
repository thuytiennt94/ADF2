package userpkg;
import java.util.ArrayList;
import session6.CS7_StaticMembers;

public class CS9_UserClass {
    ArrayList myCart = new ArrayList();
    public void createList(){
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("Teddy");
        System.out.println("Cart contents are: " + myCart);
    }

    public static void main(String[] args) {
        CS9_UserClass objUse = new CS9_UserClass();
        objUse.createList();
        session6.CS7_StaticMembers objStatic = new CS7_StaticMembers();
        objStatic.displayCount();
    }
}
