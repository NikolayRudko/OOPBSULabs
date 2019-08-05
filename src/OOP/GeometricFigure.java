package OOP;

public abstract class GeometricFigure {
    private int perimeter;
    private double area;

    GeometricFigure() {
        System.out.println("Geometric figure was initialized");
    }

    void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    void setArea(double area) {
        this.area = area;
    }

    int getPerimeter() {
        return perimeter;
    }

    double getArea() {
        return area;
    }

    public void printAreaFigure() {
        System.out.printf("Square :%s%n", getArea());
    }

    public void printPerimeterFigure() {
        System.out.printf("Perimeter: %d%n", getPerimeter());
    }

    public abstract void printFigure();
}
