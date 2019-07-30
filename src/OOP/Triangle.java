package OOP;

import java.util.Objects;

public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;
    private boolean realTriangle;

    //Creating an instance of a class
    public Triangle(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new Exception("Invalid side");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this.a = 10;
        this.b = 10;
        this.c = 10;
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

    @Override
    public void square() {
        System.out.println("Square");
    }

    @Override
    public void perimeter() {
        int per = getA() + getB() + getC();
        System.out.printf("Perimeter = %d%n", per);
    }

    @Override
    public void printFigure() {
        System.out.printf("Side A = %d\nSide B = %d\nSide C = %d\n", getA(), getB(), getC());
    }

    //determining the existence of a triangle
    private void determiningTriangle() {
        realTriangle = getA() + getB() >= getC() && getA() + getC() >= getB() && getB() + getC() >= getA();
    }

    public boolean isRealTriangle() {
        determiningTriangle();
        return realTriangle;
    }


}
