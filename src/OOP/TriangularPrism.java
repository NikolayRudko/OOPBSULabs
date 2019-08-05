package OOP;

public class TriangularPrism extends Triangle {
    private int d;

    public TriangularPrism(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
        setPerimeter(perimeterTriangularPrism(getA(), getB(), getC(), getD()));
        setArea(areaTriangularPrism(getA(), getB(), getC(), getD()));
        System.out.println("Triangular prism was initialized");
    }

    public TriangularPrism(int a) {
        super(a);
        this.d = a;
        setPerimeter(perimeterTriangularPrism(getA()));
        setArea(areaTriangularPrism(getA()));
        System.out.println("Triangular prism was initialized");
    }

    public TriangularPrism() {
        setA(10);
        setB(10);
        setC(10);
        setD(10);
        setPerimeter(perimeterTriangularPrism(getA(), getB(), getC(), getD()));
        setArea(areaTriangularPrism(getA(), getB(), getC(), getD()));
        System.out.println("Triangular prism was initialized");
    }


    public void setD(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    //calculates the perimeter of a Triangular prism
    private int perimeterTriangularPrism(int varA, int varB, int varC, int varD) {
        return 2 * (varA + varB + varC) + 3 * varD;
    }

    private int perimeterTriangularPrism(int varA) {
        return 9 * varA;
    }

    //calculates the area of a Triangular prism
    private double areaTriangularPrism(int varA, int varB, int varC, int varD) {
        double semiPerimeter = (varA + varB + varC) / 2;
        double baseArea = Math.sqrt(semiPerimeter * (semiPerimeter - varA) * (semiPerimeter - varB) * (semiPerimeter - varC));
        double faceArea = (varA + varB + varC) * varD;
        return faceArea + 2 * baseArea;
    }

    private double areaTriangularPrism(int varA) {
        double baseArea = varA * varA * Math.sqrt(3) / 4;
        double faceArea = varA * varA * 3;
        return faceArea + 2 * baseArea;
    }

    @Override
    public void printFigure() {
        System.out.println("It is triangular prism");
    }

    @Override
    public String toString() {
        return "Triangular prism{" +
                "\nside a=" + getA() +
                ",side b=" + getB() +
                ",side c=" + getC() +
                ",height d=" + getD() +
                ".\nArea=" + getArea() +
                ".\nPerimeter=" + getPerimeter() +
                "\n}";
    }

}

