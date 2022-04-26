package abstractdemo;
class CS9_Circle extends abstractdemo.CS8_Shape {
    float area;

    void calculate(float rad) {
        area = getPI() * rad * rad;
        System.out.println("Area of circle is: " + area);
    }
}

