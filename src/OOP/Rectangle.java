package OOP;

public class Rectangle extends GeometricFigure {
    private int a;
    private int b;

    public Rectangle() {
        this.a = 10;
        this.b = 10;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }




    @Override
    public void square() {

    }

    @Override
    public void perimeter() {

    }

    @Override
    public void printFigure() {
        System.out.printf("Side A = %d\nSide B = %d\n",
                getA(), getB());
    }


}
