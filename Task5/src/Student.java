package session4;
public class Student {
    int rollNo; //roll number
    String name;
    String address;
    float marks;
    public Student(){
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }
    public Student(int rNo, String sname){
        rollNo = rNo;
        name = sname;
    }
    public Student(int rNo, float score){
        rollNo = rNo;
        marks = score;
    }
    public Student(String sName, String addr){
        name = sName;
        address = addr;
    }
    public Student(int rNo, String sname, float score){
        rollNo = rNo;
        name = sname;
        marks = score;
    }
    public void displayDetails(){
        System.out.println("RollNo: " + rollNo);
        System.out.println("Student name: "+ name);
        System.out.println("Address: " + address);
        System.out.println("Score: " + marks);
    }

    public static void main(String[] args) {
        Student objStud1 = new Student();
        objStud1.displayDetails();
        System.out.println("=========");
        Student objStud2 = new Student(103, 46);
        objStud2.displayDetails();
        System.out.println("=========");
        Student objStud3 = new Student(104, "Roger", 50);
        objStud3.displayDetails();
    }
}
