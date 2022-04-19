public class TestAccount {
    public static void main(String[] args) {
        Account ac1 = new Account("1", "Tien");
        System.out.println(ac1.toString());
        //
        Account ac2 = new Account("1", "Nga", 2);
        System.out.println(ac2);
        ac2.credit(5);
        System.out.println("ac2");
        ac2.debit(100);
        System.out.println(ac2);

    }
}
