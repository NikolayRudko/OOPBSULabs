package OOP;

import java.util.Objects;

public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;
    private boolean realTriangle;

    //Creating an instance of a class
    //throws Exception
    public Triangle(int a, int b, int c) {
/*        if (a <= 0 || b <= 0 || c <= 0)
            throw new Exception("Invalid side");*/
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Triangle was initialized");
    }

    public Triangle() {
        this.a = 10;
        this.b = 10;
        this.c = 10;
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

    public void toScale(int scale) {
        a *= scale;
        b *= scale;
        c *= scale;
    }

    @Override
    public void square() {
        double semiPerimeter = (a + b + c) / 2;
        double squareTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        System.out.println("Square :" + squareTriangle);
    }

    @Override
    public void perimeter() {
        int perimeterTriangle = a + b + c;
        System.out.printf("Perimeter = %d%n", perimeterTriangle);
    }

    @Override
    public void printFigure() {
        System.out.printf("Side A = %d\nSide B = %d\nSide C = %d\n", a, b, c);
    }

    //determining the existence of a triangle
    private void determiningTriangle() {
        realTriangle = a + b >= c && a + c >= b && b + c >= a;
    }

    public boolean isRealTriangle() {
        determiningTriangle();
        return realTriangle;
    }
}
