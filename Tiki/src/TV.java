public class TV extends Store{
    private String Sceen;
    public TV(){
        super();
        this.Sceen = "65 inch";
    }
    public TV(String S){
        super();
        this.Sceen = S;
    }
    public TV(String name, int gia, String c, String S){
        super(name, gia, c);
        this.Sceen = S;
    }

    public String getSceen() {
        return Sceen;
    }

    public void setSceen(String sceen) {
        Sceen = sceen;
    }

    @Override
    public String toString() {
        return "TV:" + super.toString() + "Sceen ='" + Sceen +'.';
    }
}
