package OOP;

public class Parallelogram extends Rectangle {
    private int c;

    public Parallelogram() {
        super();
        this.c = 10;
        setPerimeter(perimeterParallelogram(getA(), getB(), this.c));
        setArea(areaParallelogram(getA(), getB(), this.c));
        System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a) {
        super(a);
        this.c = a;
        setPerimeter(perimeterParallelogram(getA()));
        setArea(areaParallelogram(getA()));
        System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a, int b) {
        super(a, b);
        this.c = 10;
        System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a, int b, int c) {
        super(a, b);
        this.c = c;
        setPerimeter(perimeterParallelogram(getA(), getB(), this.c));
        setArea(areaParallelogram(getA(), getB(), this.c));
        System.out.println("Parallelogram was initialized");
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

    //calculates the perimeter of a parallelogram
    private int perimeterParallelogram(int varA, int varB, int varC) {
        return 2 * (varA + varB) + 4 * varC;
    }

    private int perimeterParallelogram(int varA) {
        return 12 * varA;
    }

    //calculates the area of a Parallelogram
    private double areaParallelogram(int varA, int varB, int varC) {
        return 2 * varA * varB + 2 * varA * varC + 2 * varB * varC;
    }

    private double areaParallelogram(int varA) {
        return 6 * varA * varA;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "\nside a=" + getA() +
                ",side b=" + getB() +
                ",height c=" + getC() +
                ".\nArea=" + getArea() +
                ".\nPerimeter=" + getPerimeter() +
                "\n}";
    }
}
