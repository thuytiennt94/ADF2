package abstractdemo;
class Rectangle extends abstractdemo.CS8_Shape {
    float perimeter;
    float length = 10;
    void calculate(float width){
        perimeter = 2* (length + width);
        System.out.println("Perimeter of the Rectangle is: " + perimeter);
    }
}
