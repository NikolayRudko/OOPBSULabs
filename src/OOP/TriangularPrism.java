package OOP;


import java.util.Objects;

public class TriangularPrism extends Triangle implements VolumePrintable {
    private int d;

    public TriangularPrism(Color color, int a, int b, int c, int d) {
        super(color, a, b, c);
        this.d = d;
    }

    public TriangularPrism(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
        //System.out.println("Triangular prism was initialized");
    }

    public TriangularPrism(int a) {
        super(a);
        this.d = a;
        //System.out.println("Triangular prism was initialized");
    }

    public TriangularPrism() {
        setA(10);
        setB(10);
        setC(10);
        setD(10);
        //System.out.println("Triangular prism was initialized");
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    /**
     * This method outputs <i>It is triangular prism</i> to the console.
     *
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    public void printFigure() {
        System.out.println("It is triangular prism");
    }

    /**
     * This method determines whether a triangular prism exists.
     *
     * @return <b>true</b> if the triangle prism is real else return <b>false</b>.
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    public boolean isRealFigure() {
        return getD() > 0 && super.isRealFigure();
    }

    /**
     * This method outputs to the console whether this triangle prism exists or not.
     *
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    public void printExistFigure() {
        if (!isRealFigure()) {
            System.out.println("Triangular prism is not exist");
        } else {
            System.out.println("Triangular prism is exist");
        }
    }

    /**
     * This method determines the type of triangle prism and prints the result to the console.
     *
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    public void definitionFigureType() {
        if (getA() == getB() && getA() == getC())
            System.out.println("This triangular prism is regular.");
        else
            System.out.println("This triangular prism is simple.");
    }

    /**
     * This method calculates the perimeter of the triangle prism.
     *
     * @return -1 if triangle prism is not real.<br>In all other cases, it returns the perimeter.
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    int perimeterFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangular prism is real
        return 2 * super.perimeterFigure() + 3 * getD();
    }

    /**
     * This method outputs the perimeter of the triangle prism to the console.
     *
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    public void printPerimeterFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangular prism has no perimeter");
        } else {
            System.out.printf("Perimeter: %d%n", perimeterFigure());
        }
    }

    /**
     * This method calculates the area of the triangle prism.
     *
     * @return -1 if triangle prism is not real.<br>In all other cases, it returns the area.
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    double areaFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangular prism is real
        double faceArea = (getA() + getB() + getC()) * getD();
        return faceArea + 2 * super.areaFigure();
    }

    /**
     * This method outputs the area of the triangle prism to the console.
     *
     * @see Triangle
     * @see GeometricFigure
     */
    @Override
    public void printAreaFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangular prism has no area");
        } else {
            System.out.printf("Area: %f%n", areaFigure());
        }
    }

    /**
     * This method calculates the volume of the triangle prism.
     *
     * @return -1 if triangle prism is not real.<br>In all other cases, it returns the volume.</br>
     */
    private double volumeTriangularPrism() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangular prism is real
        return areaFigure() * getD();
    }

    /**
     * This method outputs the volume of the triangle prism to the console.
     */
    @Override
    public void printVolumeFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangular prism has no volume");
        } else {
            System.out.printf("Volume: %f%n", volumeTriangularPrism());
        }
    }

    @Override
    public String toString() {
        if (!isRealFigure()) {
            return "This triangular prism doesn't exist. ";
        }
        //When the triangular prism is real
        return "{" + getClass().getName() +
                "\tColor : " + getColor().printColor() +
                "\tside a=" + getA() +
                "\tside b=" + getB() +
                "\tside c=" + getC() +
                "\theight d=" + getD() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TriangularPrism that = (TriangularPrism) o;
        return d == that.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), d);
    }
}

