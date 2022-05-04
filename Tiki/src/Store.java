public class Store {
    private String Sanpham;
    private int Gia;
    private String color;
    public Store(){
        this.Sanpham = "Tivi Sony 4K 65 inch";
        this.Gia = 26430000;
        this.color = "Black";
    }
    public Store(String SP, int gia, String c){
        this.Sanpham = SP;
        this.Gia = gia;
        this.color = c;
    }
    public String getSanpham(){
        return Sanpham;
    }

    public int getGia() {
        return Gia;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setSanpham(String sanpham) {
        this.Sanpham = sanpham;
    }

    public void setGia(int gia) {
        this.Gia = gia;
    }



    @Override
    public String toString() {
        return "Store: " + "Sản phẩm ='" + Sanpham + ", Gia=" + Gia +", Màu = " + color;
    }
}
