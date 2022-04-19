public class TestAccount {
    public static void main(String[] args) {
        Account ac1 = new Account("1", "Tien");
        System.out.println("ID: " + ac1.id + ", Name: " + ac1.name);
        //
        Account ac2 = new Account("1", "Nga", 2);
        System.out.println(ac2.toString());
        System.out.println(ac2);
        System.out.println("Amount: " + ac2.credit(5));
        System.out.println("Debit: " + ac2.debit(1));
        System.out.println();
    }
}
