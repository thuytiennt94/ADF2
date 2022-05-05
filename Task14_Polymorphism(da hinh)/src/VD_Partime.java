public class VD_Partime extends VD_Staff{
    private int hour, money;
    public VD_Partime(){
        super();
        this.hour = hour;
        this.money = money;
    }
    public VD_Partime(int id, String name,int hour, int money){
        super(id, name);
        this.hour = hour;
        this.money = money;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public double getSalary() {
        return hour * money;
    }

    @Override
    public String toString() {
        return "Partime: " + super.toString() + "hour = " + hour + '.';
    }
}


