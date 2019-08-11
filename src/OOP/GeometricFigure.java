package OOP;

public abstract class GeometricFigure {
    private Color color;

    public GeometricFigure(Color color) {
        this.color = color;
    }

    public GeometricFigure() {
        this.color = Color.WHITE;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void printAreaFigure();

    public abstract void printPerimeterFigure();

    public abstract void printFigure();
}
