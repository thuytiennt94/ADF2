class CS7_ParttimeEmployee extends Employee{
    String shift;
    public CS7_ParttimeEmployee (String id, String name, int sal, String shift){
        super(id, name, sal);;
        this.shift = shift;
    }
    public void displayDetails(){
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift: " + shift);
    }
    public static void main(String[] args) {
        Employee objEmp = new Employee("E00", "Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
        System.out.println("-----------------------------");
        Employee objEmp1 = new CS7_ParttimeEmployee("E002", "RobSmith", 30000, "Day");
        objEmp1.displayDetails();
    }
}
