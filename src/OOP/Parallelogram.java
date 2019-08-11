package OOP;

public class Parallelogram extends Rectangle {
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isRealParallelogram() {
        return getC() > 0 && isRealRectangle();
    }

    public void printExistTriangularPrism() {
        if (isRealParallelogram())
            System.out.println("Parallelogram prism is exist");
        else
            System.out.println("Parallelogram prism is not exist");
    }

    //calculates the perimeter of a parallelogram
    int perimeterParallelogram() {
        return 2 * perimeterRectangle() + 4 * getC();
    }

    @Override
    public void printPerimeterFigure() {
        if (isRealParallelogram())
            System.out.printf("Perimeter: %d%n", perimeterParallelogram());
        else
            System.out.println("The parallelogram has no perimeter");
    }

    //calculates the area of a Parallelogram
    double ariaParallelogram() {
        double faceArea = (getA() + getB()) * getC();
        return faceArea + 2 * areaRectangle();
    }

    @Override
    public void printAreaFigure() {
        if (isRealParallelogram())
            System.out.printf("Area: %f%n", ariaParallelogram());
        else
            System.out.println("The parallelogram has no area");
    }

    private double volumeParallelogram() {
        return areaRectangle() * getC();
    }

    public void printVolumeFigure() {
        if (isRealParallelogram())
            System.out.printf("Volume: %f%n", volumeParallelogram());
        else
            System.out.println("The parallelogram has no volume");
    }


    @Override
    public void printFigure() {
        System.out.println("It is parallelogram");
    }

    @Override
    public String toString() {
        if (isRealParallelogram())
            return "Parallelogram{" +
                    "\ncolor: " + getColor().printColor() +
                    "\nside a=" + getA() +
                    ",\nside b=" + getB() +
                    ",\nheight c=" + getC() +
                    "}";
        return "Parallelogram prism does not exist";
    }
}
