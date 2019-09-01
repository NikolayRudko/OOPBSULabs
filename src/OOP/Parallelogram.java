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

    @Override
    public void printFigure() {
        System.out.println("It is parallelogram");
    }

    @Override
    public boolean isRealFigure() {
        return getC() > 0 && super.isRealFigure();
    }

    @Override
    public void printExistFigure() {
        if (!isRealFigure()) {
            System.out.println("This parallelogram doesn't exist.");
        } else {
            System.out.println("This parallelogram exists.");
        }
    }

    @Override
    public void definitionFigureType() {
        //empty method
    }
    //calculates the perimeter of a parallelogram

    @Override
    protected int perimeterFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the parallelogram is real
        return 2 * super.perimeterFigure() + 4 * getC();
    }

    @Override
    public void printPerimeterFigure() {
        if (!isRealFigure()) {
            System.out.println("The parallelogram has no perimeter");
        } else {
            System.out.printf("Perimeter: %d%n", perimeterFigure());
        }
    }
    //calculates the area of a Parallelogram

    @Override
    double areaFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the parallelogram is real
        double faceArea = (getA() + getB()) * getC();
        return faceArea + 2 * super.areaFigure();
    }

    @Override
    public void printAreaFigure() {
        if (!isRealFigure()) {
            System.out.println("The parallelogram has no area");
        } else {
            System.out.printf("Area: %f%n", areaFigure());
        }
    }

    public double volumeParallelogram() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the parallelogram is real
        return areaFigure() * getC();
    }

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
