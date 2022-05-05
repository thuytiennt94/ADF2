public class TestStaff {
    public static void main(String[] args) {
        VD_Staff s1 = new VD_Fulltime(1 , "mai", 9000000);
        System.out.println(s1);
        System.out.println("Salary: " + s1.getSalary());
        VD_Staff s2 = new VD_Partime(2, "tung", 8, 30000);
        System.out.println(s2);
        System.out.println("Salary: " + s2.getSalary());
    }
}
