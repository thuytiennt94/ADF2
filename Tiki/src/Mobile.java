public class Mobile extends Store{
    private String Sceen;
    private String origin;
    public Mobile(){
        super();
        this.Sceen = "6.7 inch";
        this.origin = "iPhone";
    }
    public Mobile(String S, String O){
        super();
        this.Sceen = S;
        this.origin = O;
    }
    public Mobile(String N, int price, String C, String S, String O){
        super(N, price, C);
        this.Sceen = S;
        this.origin = O;
    }

    public String getSceen() {
        return Sceen;
    }
    public void setSceen(String sceen) {
        Sceen = sceen;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Mobile: "+ super.toString() + "Sceen='" + Sceen +  ", origin='" + origin +  '.';
    }
}
