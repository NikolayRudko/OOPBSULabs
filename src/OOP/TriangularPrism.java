package OOP;

public class TriangularPrism extends Triangle implements VolumeFigure {
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

    public void printExistTriangularPrism() {
        if (isRealFigure())
            System.out.println("Triangular prism is exist");
        else
            System.out.println("Triangular prism is not exist");
    }

    //calculates the perimeter of a Triangular prism
    int perimeterTriangularPrism() {
        return 2 * perimeterTriangle() + 3 * getD();
    }

    @Override
    public void printPerimeterFigure() {
        if (isRealFigure())
            System.out.printf("Perimeter: %d%n", perimeterTriangularPrism());
        else
            System.out.println("The triangular prism has no perimeter");
    }

    double ariaTriangularPrism() {
        double faceArea = (getA() + getB() + getC()) * getD();
        return faceArea + 2 * areaTriangle();
    }

    //calculates the area of a Triangular prism

    @Override
    public void printAreaFigure() {
        if (isRealFigure())
            System.out.printf("Area: %f%n", ariaTriangularPrism());
        else
            System.out.println("The triangular prism has no area");
    }

    private double volumeTriangularPrism() {
        return areaTriangle() * getD();
    }

    @Override
    public void printVolumeFigure() {
        if (isRealFigure())
            System.out.printf("Volume: %f%n", volumeTriangularPrism());
        else
            System.out.println("The triangular prism has no volume");
    }

    @Override
    public void printFigure() {
        System.out.println("It is triangular prism");
    }

    @Override
    public String toString() {
        if (isRealFigure())
            return "Triangular prism{" +
                    "\ncolor: " + getColor().printColor() +
                    "\nside a=" + getA() +
                    ",\nside b=" + getB() +
                    ",\nside c=" + getC() +
                    ",\nheight d=" + getD() +
                    "}";
        return "Triangular prism does not exist";
    }
}

