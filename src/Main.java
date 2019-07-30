import OOP.Rectangle;
import OOP.Triangle;

public class Main {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle(2, 4, 8);
/*

        //print side triangle
        System.out.println("Use method \"Print triangle\":");
        triangle2.printFigure();
        System.out.println();
        triangle2.setA(4);
        triangle2.setB(4);
        triangle2.setC(4);
        System.out.println("Use gets:");
        System.out.printf("Side A = %d\nSide B = %d\nSide C = %d\n",
                triangle2.getA(), triangle.getB(), triangle2.getC());
        System.out.println("OOP.Triangle is real " + triangle2.isRealTriangle());
        triangle2.setA(4);
        triangle2.setB(4);
        triangle2.setC(10);
        System.out.println("OOP.Triangle is real " + triangle2.isRealTriangle());

        triangle2.perimeter();
        triangle2.square();
*/


        Rectangle rectangle = new Rectangle();
        rectangle.printFigure();
        Rectangle rectangle1 = new Rectangle(20,30);
        rectangle1.printFigure();
        Rectangle rectangle2 = new Rectangle(30);
        rectangle2.printFigure();

    }
}
