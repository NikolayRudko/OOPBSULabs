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

    @Override
    public boolean isRealFigure() {
        return getD() > 0 && super.isRealFigure();
    }

    @Override
    public void printExistFigure() {
        if (!isRealFigure()) {
            System.out.println("Triangular prism is not exist");
        } else {
            System.out.println("Triangular prism is exist");
        }
    }


    @Override
    public void definitionFigureType() {
        //empty method
    }

    //calculates the perimeter of a Triangular prism
    @Override
    int perimeterFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangular prism is real
        return 2 * super.perimeterFigure() + 3 * getD();
    }

    @Override
    public void printPerimeterFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangular prism has no perimeter");
        } else {
            System.out.printf("Perimeter: %d%n", perimeterFigure());
        }
    }

    @Override
    double areaFigure() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangular prism is real
        double faceArea = (getA() + getB() + getC()) * getD();
        return faceArea + 2 * super.areaFigure();
    }

    //calculates the area of a Triangular prism

    @Override
    public void printAreaFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangular prism has no area");
        } else {
            System.out.printf("Area: %f%n", areaFigure());
        }
    }

    private double volumeTriangularPrism() {
        if (!isRealFigure()) {
            return -1;
        }
        //When the triangular prism is real
        return areaFigure() * getD();
    }

    @Override
    public void printVolumeFigure() {
        if (!isRealFigure()) {
            System.out.println("The triangular prism has no volume");
        } else {
            System.out.printf("Volume: %f%n", volumeTriangularPrism());
        }
    }

    @Override
    public void printFigure() {
        System.out.println("It is triangular prism");
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

