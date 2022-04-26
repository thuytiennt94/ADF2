package abstractdemo;
import java.awt.*;
public class CS10_Calculator {
    public static void main(String[] args) {
        abstractdemo.CS8_Shape objShape ;
        String shape;
        if (args.length == 2){
            shape = args[0].toLowerCase();
            switch (shape){
                case "circle": objShape = new abstractdemo.CS9_Circle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
                case"rectangle":objShape = new abstractdemo.Rectangle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
            }
        }
        else{
            System.out.println("Usage: javaCalculator<shape-name><value>");
        }
    }
}
