public class VD_Staff {
    private int ID;
    private String name;
    public VD_Staff(){
        this.ID = 1;
        this.name = " tien";
    }
    public VD_Staff(int id, String name){
        this.ID = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", name='" + name  + '.';
    }
    public double getSalary(){
        System.out.println("cannot computer salary");
        return 0;
    }
}
