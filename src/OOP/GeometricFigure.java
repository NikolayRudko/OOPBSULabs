package OOP;

import java.util.Objects;

public abstract class GeometricFigure {
    private Color color;

    GeometricFigure(Color color) {
        this.color = color;
    }

    GeometricFigure() {
        this.color = Color.WHITE;
    }

    Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    /**
     * This method calculates the area of the geometric figure.
     */
    abstract double areaFigure();

    /**
     * This method outputs the area of the geometric figure to the console.
     */
    public abstract void printAreaFigure();


    /**
     * This method calculate the perimeter of the geometric figure.
     */
    abstract int perimeterFigure();

    /**
     * This method outputs the perimeter of the geometric figure to the console.
     */
    public abstract void printPerimeterFigure();

    /**
     * This method outputs the type of geometric figure to the console.
     */
    public abstract void printFigure();

    /**
     * This method determines whether a figure exists.
     */
    public abstract boolean isRealFigure();

    /**
     * This method outputs to the console whether this figure exists or not.
     */
    public abstract void printExistFigure();

    /**
     * This method defines the type of geometric figure.
     */
    public abstract void definitionFigureType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricFigure that = (GeometricFigure) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
