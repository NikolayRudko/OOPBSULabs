package OOP;

public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;

    //Creating an instance of a class
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        setArea(areaTriangle(this.a, this.b, this.c));
        setPerimeter(perimeterTriangle(this.a, this.b, this.c));
        System.out.println("Triangle was initialized");
    }

    public Triangle(int a) {
        this.a = a;
        this.b = a;
        this.c = a;
        setArea(areaTriangle(this.a, this.b, this.c));
        setPerimeter(perimeterTriangle(this.a, this.b, this.c));
        System.out.println("Triangle was initialized");
    }

    public Triangle() {
        this.a = 10;
        this.b = 10;
        this.c = 10;
        setArea(areaTriangle(this.a, this.b, this.c));
        setPerimeter(perimeterTriangle(this.a, this.b, this.c));
        System.out.println("Triangle was initialized");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    //Multiplies the sides of a triangle by a given number
    public void toScale(int scale) {
        a *= scale;
        b *= scale;
        c *= scale;
    }

    //determining the existence of a triangle
    public boolean isRealTriangle() {
        return a + b >= c && a + c >= b && b + c >= a;
    }

    //calculates the perimeter of a triangle
    private int perimeterTriangle(int varA, int varB, int varC) {
        return varA + varB + varC;
    }

    //calculates the area of a triangle
    private double areaTriangle(int varA, int varB, int varC) {
        double semiPerimeter = (varA + varB + varC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - varA) * (semiPerimeter - varB) * (semiPerimeter - varC));
    }

    @Override
    public void printFigure() {
        System.out.println("It is triangle");
    }

    @Override
    public String toString() {
        if (isRealTriangle())
            return "Triangle{" +
                    "\nside a=" + a +
                    ", side b=" + b +
                    ", side c=" + c +
                    ".\nArea=" + getArea() +
                    ".\nPerimeter=" + getPerimeter() +
                    "\n}";
        return "Triangle does not exist";
    }
}
