package OOP;

import java.util.Objects;

public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;

    //Creating an instance of a class


    public Triangle(Color color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    /**
     * This method outputs <i>It is triangle</i> to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void printFigure() {
        System.out.println("It is triangle");
    }

    /**
     * This method determines whether a triangle exists.
     *
     * @return <b>true</b> if the triangle is real else return <b>false</b>.
     * @see GeometricFigure
     */
    @Override
    public boolean isRealFigure() {
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }

    /**
     * This method outputs to the console whether this triangle exists or not.
     *
     * @see GeometricFigure
     */
    @Override
    public void printExistFigure() {
        if (!isRealFigure()) {
            System.out.println("This triangle doesn't exist");
        } else {
            System.out.println("This triangle exists");
        }
    }

    /**
     * This method multiplies all sides of the triangle by the transmitted value.
     *
     * @param scale the coefficient of how much the sides of the triangle will increase.
     */
    public void toScale(int scale) {
        if (!isRealFigure()) {
            System.out.println("The operation cannot be performed, the triangle does not exist.");
        } else {
            a *= scale;
            b *= scale;
            c *= scale;
        }
    }

    /**
     * This method determines the type of triangle and prints the result to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void definitionFigureType() {
        if (!isRealFigure())
            System.out.println("This triangle doesn't exist");
        else {
            if (getA() == getB() && getA() == getC())
                System.out.println("This triangle is an equilateral triangle");
            else if (getA() == getB() || getB() == getC() || getC() == getA())
                System.out.println("This triangle is an isosceles triangle");
            else
                System.out.println("This triangle is a versatile triangle");
        }
    }

    /**
     * This method calculates the perimeter of the triangle.
     *
     * @return -1 if triangle is not real.<br>In all other cases, it returns the perimeter.
     * @see GeometricFigure
     */
    @Override
    int perimeterFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangle is real
        return getA() + getB() + getC();
    }

    /**
     * This method outputs the perimeter of the triangle to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void printPerimeterFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangle has no perimeter");
        } else {
            System.out.printf("Perimeter: %d%n", perimeterFigure());
        }
    }

    /**
     * This method calculates the area of the triangle.
     *
     * @return -1 if triangle is not real.<br>In all other cases, it returns the area.
     * @see GeometricFigure
     */
    @Override
    double areaFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangle is real
        double semiPerimeter = (getA() + getB() + getC()) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - getA()) * (semiPerimeter - getB()) * (semiPerimeter - getC()));
    }

    /**
     * This method outputs the area of the triangle to the console.
     *
     * @see GeometricFigure
     */
    @Override
    public void printAreaFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangle has no area");
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
            return "This triangle doesn't exist";
        }
        //When the triangle is real
        return "{" + getClass().getName() +
                "\tColor: " + getColor().printColor() +
                "\tside a=" + getA() +
                "\tside b=" + getB() +
                "\tside c=" + getC() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b &&
                c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b, c);
    }
}
