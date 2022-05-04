public class testStore {
    public static void main(String[] args) {
        //store
        Store s1 = new Store("TV Samsung ", 29990000, "gray");
        System.out.println(s1);
        s1.setSanpham("iPhone 12 promax");
        s1.setGia(25700000);
        s1.setColor("blue");
        System.out.println(s1);
        //TV
        TV t1 = new TV("Smart TV Casper",4289000, "black", "32inch");
        System.out.println(t1);
        TV t2 = new TV();
        System.out.println(t2);
        //mobile
        Mobile m1 = new Mobile("Ss galaxy S22Ultra", 30990000, "red", "6.8 inch", "samsung");
        System.out.println(m1);
        Mobile m2 = new Mobile();
        System.out.println(m2);
        m1.setSanpham("Oppo reno5");
        m1.setGia(6490000);
        m1.setColor("blue");
        m1.setSceen("6.43inch");
        m1.setOrigin("oppo");
        System.out.println(m1);
    }
}
