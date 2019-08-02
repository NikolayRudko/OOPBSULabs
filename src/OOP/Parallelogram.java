package OOP;

public class Parallelogram extends Rectangle {
    private int c;

    public Parallelogram() {
        super();
        c = 10;
        System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a) {
        super(a);
        c = a;
        System.out.println("Parallelogram was initialized");
    }

    public Parallelogram(int a, int b) {
        super(a, b);
        c = 10;
        System.out.println("Parallelogram was initialized");
    }


    public Parallelogram(int a, int b, int c) {
        super(a, b);
        this.c = c;
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
        System.out.printf("Side A = %d\nSide B = %d\nSide C = %d\n", getA(), getB(), getC());
    }


}
