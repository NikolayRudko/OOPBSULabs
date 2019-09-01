package OOP;

import java.util.Objects;

public class Parallelogram extends Rectangle implements VolumePrintable {
    private int c;

    public Parallelogram() {
        super();
        this.c = 10;
        //System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a) {
        super(a);
        this.c = a;
        //System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a, int b) {
        super(a, b);
        this.c = 10;
        //System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a, int b, int c) {
        super(a, b);
        this.c = c;
        //System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(Color color, int a, int b, int c) {
        super(color, a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    /**
     * This method outputs <i>It is parallelogram</i> to the console.
     *
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    public void printFigure() {
        System.out.println("It is parallelogram");
    }

    /**
     * This method determines whether a parallelogram exists.
     *
     * @return <b>true</b> if the rectangle is real else return <b>false</b>.
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    public boolean isRealFigure() {
        return getC() > 0 && super.isRealFigure();
    }

    /**
     * This method outputs to the console whether this parallelogram exists or not.
     *
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    public void printExistFigure() {
        if (!isRealFigure()) {
            System.out.println("This parallelogram doesn't exist.");
        } else {
            System.out.println("This parallelogram exists.");
        }
    }

    /**
     * This method determines the type of parallelogram and prints the result to the console.
     *
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    public void definitionFigureType() {
        if (getA() == getB() && getA() == getC())
            System.out.println("This parallelogram is a cube");
        else
            System.out.println("This is a simple parallelogram.");
    }

    /**
     * This method calculates the perimeter of the parallelogram.
     *
     * @return -1 if parallelogram is not real.<br>In all other cases, it returns the perimeter.</br>
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    protected int perimeterFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the parallelogram is real
        return 2 * super.perimeterFigure() + 4 * getC();
    }

    /**
     * This method outputs the perimeter of the parallelogram to the console.
     *
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    public void printPerimeterFigure() {
        if (!isRealFigure()) {
            System.out.println("The parallelogram has no perimeter");
        } else {
            System.out.printf("Perimeter: %d%n", perimeterFigure());
        }
    }

    /**
     * This method calculates the area of the parallelogram.
     *
     * @return -1 if parallelogram is not real.<br>In all other cases, it returns the area.</br>
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    double areaFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the parallelogram is real
        double faceArea = (getA() + getB()) * getC();
        return faceArea + 2 * super.areaFigure();
    }

    /**
     * This method outputs the area of the parallelogram to the console.
     *
     * @see Rectangle
     * @see GeometricFigure
     */
    @Override
    public void printAreaFigure() {
        if (!isRealFigure()) {
            System.out.println("The parallelogram has no area");
        } else {
            System.out.printf("Area: %f%n", areaFigure());
        }
    }

    /**
     * This method calculates the volume of the parallelogram.
     *
     * @return -1 if parallelogram is not real.<br>In all other cases, it returns the volume.</br>
     */
    private double volumeParallelogram() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the parallelogram is real
        return areaFigure() * getC();
    }

    /**
     * This method outputs the volume of the parallelogram to the console.
     */
    @Override
    public void printVolumeFigure() {
        if (!isRealFigure()) {
            System.out.println("The parallelogram has no volume");
        } else {
            System.out.printf("Volume: %f%n", volumeParallelogram());
        }
    }


    @Override
    public String toString() {
        if (!isRealFigure()) {
            return "This parallelogram doesn't exist. ";
        }
        //When the parallelogram is real
        return "{" + getClass().getName() +
                "\tColor:" + getColor().printColor() +
                "\tside a=" + getA() +
                "\tside b=" + getB() +
                "\theight c=" + getC() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parallelogram that = (Parallelogram) o;
        return c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), c);
    }
}
