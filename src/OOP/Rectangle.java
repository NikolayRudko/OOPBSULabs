package OOP;

public class Rectangle extends GeometricFigure {
    private int a;
    private int b;

    public Rectangle() {
        a = 10;
        b = 10;
        //System.out.println("Rectangle was initialized");
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        //System.out.println("Rectangle was initialized");
    }

    public Rectangle(Color color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
        //System.out.println("Rectangle was initialized");
    }

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
        //System.out.println("Rectangle was initialized");
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

    public boolean isRealRectangle() {
        return getA() > 0 || getB() > 0;
    }

    public void printExistRectangle() {
        if (isRealRectangle())
            System.out.println("Rectangle is exist");
        else
            System.out.println("Rectangle is not exist");
    }

    public void definitionRectangleType() {
        if (!isRealRectangle())
            System.out.println("This rectangle does not exist!!!");
        else {
            if (getA() == getB())
                System.out.println("This rectangle is square");
            else
                System.out.println("This is a simple rectangle.");
        }
    }

    int perimeterRectangle() {
        return 2 * (getA() + getB());
    }

    @Override
    public void printPerimeterFigure() {
        if (isRealRectangle())
            System.out.printf("Perimeter: %d%n", perimeterRectangle());
        else
            System.out.println("The rectangle has no perimeter");


    }

    double areaRectangle() {
        return getA() * getB();
    }

    @Override
    public void printAreaFigure() {
        if (isRealRectangle())
            System.out.printf("Area: %f%n", areaRectangle());
        else
            System.out.println("The rectangle has no perimeter");
    }

    @Override
    public void printFigure() {
        System.out.println("It is Rectangle");
    }

    @Override
    public String toString() {
        if (isRealRectangle())
            return "Rectangle{" +
                    "\ncolor: " + getColor().printColor() +
                    "\nside a=" + getA() +
                    ",\nside b=" + getB() +
                    "}";
        return "Rectangle does not exist";
    }
}
