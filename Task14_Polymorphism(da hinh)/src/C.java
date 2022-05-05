public class C extends B{
    public C(){
        super();
        System.out.println("Constructed an instance of C");
    }

    @Override
    public String toString() {
        return "this is C";
    }
}
