package session4;
public class Employee1 {
    int empID;//variable to store employee ID
    String empName; //variable to store employee Name
    private String SSN;//security number
    protected String empDesig; //designation
    public Employee1(int ID, String Name){
        empID = ID;
        empName = Name;
    }

    public String getSSN() {//accessor for ssn
        return SSN;
    }/**/

    public void setSSN(String ssn) {
        SSN = ssn;
    }

    public void setEmpDesig(String desig) {
        empDesig = desig;
    }

    public void display() {
        System.out.println("Employee ID is "+empID);
        System.out.println("Employee name is " + empName);
        System.out.println("Designation is " + empDesig);
        System.out.println("SSN is " + SSN);
    }

    public static void main(String[] args) {
        Employee1 objEmp1 = new Employee1(1200, "Roger stevens");
        objEmp1.empDesig = "Manager";
        objEmp1.SSN = "281-72-3873";
        objEmp1.display();
    }
}
