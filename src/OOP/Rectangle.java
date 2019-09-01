package OOP;

import java.util.Objects;

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

    /**
     * This method outputs <i>It is Rectangle</i> to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void printFigure() {
        System.out.println("It is Rectangle");
    }

    /**
     * This method determines whether a rectangle exists.
     *
     * @return <b>true</b> if the rectangle is real else return <b>false</b>.
     * @see GeometricFigure
     */
    @Override
    public boolean isRealFigure() {
        return getA() > 0 && getB() > 0;
    }

    /**
     * This method outputs to the console whether this rectangle exists or not.
     *
     * @see GeometricFigure
     */
    @Override
    public void printExistFigure() {
        if (!isRealFigure()) {
            System.out.println("This rectangle doesn't exist");
        } else {
            System.out.println("This rectangle exists");
        }
    }

    /**
     * This method determines the type of rectangle and prints the result to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void definitionFigureType() {
        if (!isRealFigure()) {
            System.out.println("This rectangle doesn't exist");
        } else {
            if (getA() == getB())
                System.out.println("This rectangle is a square");
            else
                System.out.println("This is a simple rectangle.");
        }
    }

    /**
     * This method calculates the perimeter of the rectangle.
     *
     * @return -1 if rectangle is not real.<br>In all other cases, it returns the perimeter.
     * @see GeometricFigure
     */
    @Override
    protected int perimeterFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the rectangle is real
        return 2 * (getA() + getB());
    }

    /**
     * This method outputs the perimeter of the rectangle to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void printPerimeterFigure() {
        if (!isRealFigure()) {
            System.out.println("The rectangle has no perimeter");
        } else {
            System.out.printf("Perimeter: %d%n", perimeterFigure());
        }
    }

    /**
     * This method calculates the area of the rectangle.
     *
     * @return -1 if rectangle is not real.<br>In all other cases, it returns the area.
     * @see GeometricFigure
     */
    @Override
    double areaFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the rectangle is real
        return getA() * getB();
    }

    /**
     * This method outputs the area of the rectangle to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void printAreaFigure() {
        if (!isRealFigure()) {
            System.out.println("The rectangle has no perimeter");
        } else {
            System.out.printf("Area: %f%n", areaFigure());
        }
    }

    /**
     * Returns the string describing the object.
     *
     * @return a string representation of the object.
     * @see Object
     */
    @Override
    public String toString() {
        if (!isRealFigure()) {
            return "Rectangle does not exist";
        }
        //When the rectangle is real
        return "{" + getClass().getName() +
                "\tColor: " + getColor().printColor() +
                "\tside a=" + getA() +
                "\tside b=" + getB() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a &&
                b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b);
    }
}
