package OOP;

public class Rectangle extends GeometricFigure {
    private int a;
    private int b;

    public Rectangle() {
        a = 10;
        b = 10;
        setArea(areaRectangle(this.a, this.b));
        setPerimeter(perimeterRectangle(this.a, this.b));
        System.out.println("Rectangle was initialized");
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        setArea(areaRectangle(this.a, this.b));
        setPerimeter(perimeterRectangle(this.a, this.b));
        System.out.println("Rectangle was initialized");
    }

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
        setArea(areaRectangle(this.a));
        setPerimeter(perimeterRectangle(this.a));
        System.out.println("Rectangle was initialized");
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

    //calculates the perimeter of a rectangle
    private int perimeterRectangle(int varA, int varB) {
        return 2 * (varA + varB);
    }

    private int perimeterRectangle(int varA) {
        return 4 * varA;
    }

    //calculates the area of a rectangle
    private double areaRectangle(int varA, int varB) {
        return varA * varB;
    }

    private double areaRectangle(int varA) {
        return varA * varA;
    }

    @Override
    public void printFigure() {
        System.out.println("It is Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "\nside a=" + a +
                ",side b=" + b +
                ".\nArea=" + getArea() +
                ".\nPerimeter=" + getPerimeter() +
                "\n}";
    }
}
