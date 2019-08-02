import OOP.NewTriangle;
import OOP.Parallelogram;
import OOP.Rectangle;
import OOP.Triangle;

public class Main {
    //throws Exception
    public static void main(String[] args) {
        //print side triangle
        System.out.println("Triangle");
        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle(2, 4, 6);
        System.out.println("Use method \"printFigure\":");
        triangle.printFigure();
        System.out.println("Use method \"toScale\":");
        triangle.toScale(2);
        System.out.println("Use method \"printFigure\":");
        triangle.printFigure();
        System.out.println("Use method printPerimeterFigure:");
        triangle.printPerimeterFigure();
        System.out.println("Use method printSquareFigure:");
        triangle.printSquareFigure();
        System.out.println();
        System.out.println("Use set");
        triangle2.setA(4);
        triangle2.setB(4);
        triangle2.setC(4);
        System.out.println("Use gets:");
        System.out.printf("Side A = %d\nSide B = %d\nSide C = %d\n",
                triangle2.getA(), triangle2.getB(), triangle2.getC());
        System.out.println("OOP.Triangle is real " + triangle2.isRealTriangle());
        triangle2.setA(4);
        triangle2.setB(4);
        triangle2.setC(10);
        triangle2.printFigure();
        System.out.println("OOP.Triangle is real " + triangle2.isRealTriangle());
        System.out.println();
        System.out.println();

        System.out.println("NewTriangle");
        NewTriangle newTriangle = new NewTriangle();
        System.out.println("Use method \"printFigure\":");
        newTriangle.printFigure();
        System.out.println();

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle();
        System.out.println("Use method \"printFigure\":");
        rectangle.printFigure();
        Rectangle rectangle1 = new Rectangle(20, 30);
        System.out.println("Use method \"printFigure\":");
        rectangle1.printFigure();
        Rectangle rectangle2 = new Rectangle(30);
        System.out.println("Use method \"printFigure\":");
        rectangle2.printFigure();

        System.out.println("Parallelogram");
        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setC(10);
        System.out.println("Side C = " + parallelogram.getC());
        parallelogram.printFigure();
        Parallelogram parallelogram1 = new Parallelogram(10);
        parallelogram1.setC(20);
        System.out.println("Side C = " + parallelogram1.getC());
        parallelogram1.printFigure();
        Parallelogram parallelogram2 = new Parallelogram(20, 20);
        parallelogram2.setC(30);
        System.out.println("Side C = " + parallelogram2.getC());
        parallelogram2.printFigure();
        Parallelogram parallelogram3 = new Parallelogram(30, 30, 30);
        parallelogram3.setC(40);
        System.out.println("Side C = " + parallelogram3.getC());
        parallelogram3.printFigure();
    }
}
