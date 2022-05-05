public class VD_Fulltime extends VD_Staff{
    private int money;
    public VD_Fulltime(){
        super();
        this.money = money;
    }
    public VD_Fulltime(int id, String name,int money){
        super(id, name);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public double getSalary() {
        return this.money;
    }

    @Override
    public String toString() {
        return "Fulltime: " + super.toString() + "money = " + money + '.';
    }
}
