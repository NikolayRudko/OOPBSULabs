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
        //System.out.println("Triangle was initialized");
    }

    public Triangle(int a) {
        this.a = a;
        this.b = a;
        this.c = a;
        //System.out.println("Triangle was initialized");
    }

    public Triangle() {
        this.a = 10;
        this.b = 10;
        this.c = 10;
        // System.out.println("Triangle was initialized");
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
    public void printExistTriangle() {
        if (isRealTriangle())
            System.out.println("Triangle is exist");
        else
            System.out.println("Triangle is not exist");
    }

    public void definitionTriangleType() {
        if (!isRealTriangle())
            System.out.println("This triangle does not exist!!!");
        else {
            if (getA() == getB() && getA() == getC())
                System.out.println("This triangle is equilateral");
            else if (getA() == getB() || getB() == getC() || getC() == getA())
                System.out.println("This triangle is isosceles");
            else
                System.out.println("This triangle is versatile");
        }
    }

    int perimeterTriangle() {
        return getA() + getB() + getC();
    }

    @Override
    public void printPerimeterFigure() {
        if (isRealTriangle())
            System.out.printf("Perimeter: %d%n", perimeterTriangle());
        else
            System.out.println("The triangle has no perimeter");
    }

    double areaTriangle() {
        double semiPerimeter = (getA() + getB() + getC()) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - getA()) * (semiPerimeter - getB()) * (semiPerimeter - getC()));
    }

    @Override
    public void printAreaFigure() {
        if (isRealTriangle())
            System.out.printf("Area: %f%n", areaTriangle());
        else
            System.out.println("The triangle has no area");
    }

    public boolean isRealTriangle() {
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }

    @Override
    public void printFigure() {
        System.out.println("It is triangle");
    }

    @Override
    public String toString() {
        if (isRealTriangle())
            return "Triangle{" +
                    "\ncolor: " + getColor().printColor() +
                    "\nside a=" + getA() +
                    ",\nside b=" + getB() +
                    ",\nside c=" + getC() +
                    "}";
        return "Triangle does not exist";
    }
}
