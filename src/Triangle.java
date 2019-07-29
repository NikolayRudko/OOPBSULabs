public class Triangle {
    private int a;
    private int b;
    private int c;
    private boolean realTriangle;

    //Creating an instance of a class
    public Triangle(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new Exception("Invalid side");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this.a = 10;
        this.b = 10;
        this.c = 10;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void printSide() {
        System.out.printf("Side A = %d\nSide B = %d\nSide C = %d\n", a, b, c);
    }

    //determining the existence of a triangle
    private void determiningTriangle() {
        if (a + b < c || a + c < b || b + c < a)
            realTriangle = false;
        else
            realTriangle = true;
    }

    public boolean isRealTriangle() {
        determiningTriangle();
        return realTriangle;
    }

}
