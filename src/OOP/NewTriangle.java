package OOP;

public class NewTriangle extends Triangle {
    public NewTriangle(int a, int b, int c) {
        super(a, b, c);
        System.out.println("NewTriangle was initialized");
    }

    public NewTriangle() {
        setA(10);
        setB(10);
        setC(10);
        System.out.println("NewTriangle was initialized");
    }
}
