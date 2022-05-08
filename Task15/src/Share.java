abstract public class Share {
    private String color;
    public Share(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Share[" + "color=" + color  + ']';
    }
    abstract public double getArea();
}
