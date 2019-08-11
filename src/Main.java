import OOP.*;

public class Main {
    public static void main(String[] args) {
        //Triangle
        {
            Triangle triangle = new Triangle();
            Triangle triangle2 = new Triangle(2, 4, 6);
            //Use gets
            System.out.printf("Use gets:%nSide A = %d%nSide B = %d%nSide C = %d%n",
                    triangle2.getA(), triangle2.getB(), triangle2.getC());
            System.out.println();

            useFigure(triangle);
            useFigure(triangle2);
            //Use set

            triangle2.setA(4);
            triangle2.setB(4);
            triangle2.setC(4);
            useFigure(triangle2);
            System.out.println("Use method \"isRealTriangle\":");
            System.out.println("Triangle is real " + triangle2.isRealTriangle());

            triangle2.setA(4);
            triangle2.setB(4);
            triangle2.setC(10);
            triangle2.printFigure();
            useFigure(triangle2);
        }
        //TriangularPrism
        {
            TriangularPrism triangularPrism = new TriangularPrism();
            TriangularPrism triangularPrism1 = new TriangularPrism(12,16,15,10);
            TriangularPrism triangularPrism2 = new TriangularPrism(12,16,15,0);
            useFigure(triangularPrism);
            useFigure(triangularPrism1);
            useFigure(triangularPrism2);
        }

        //Rectangle
        {
            //System.out.println("Rectangle");
            Rectangle rectangle = new Rectangle();
            Rectangle rectangle1 = new Rectangle(20, 30);
            Rectangle rectangle2 = new Rectangle(0);
            useFigure(rectangle);
            useFigure(rectangle1);
            useFigure(rectangle2);
        }

        //Parallelogram
        {
            //System.out.println("Parallelogram");
            Parallelogram parallelogram = new Parallelogram();
            parallelogram.setC(10);
            System.out.println("Side C = " + parallelogram.getC());
            Parallelogram parallelogram1 = new Parallelogram(0);
            Parallelogram parallelogram2 = new Parallelogram(20, 20);
            parallelogram2.setC(30);
            Parallelogram parallelogram3 = new Parallelogram(30, 30, 30);
            parallelogram3.setC(40);
            useFigure(parallelogram);
            useFigure(parallelogram1);
            useFigure(parallelogram2);
            useFigure(parallelogram3);
        }
    }

    private static void useFigure(GeometricFigure geometricFigure) {
        System.out.println(geometricFigure);
        geometricFigure.printPerimeterFigure();
        geometricFigure.printAreaFigure();
        if (geometricFigure instanceof Triangle) {
            if (((Triangle) geometricFigure).isRealTriangle()) {
                ((Triangle) geometricFigure).definitionTriangleType();
            }

            if (geometricFigure instanceof TriangularPrism) {
                if (((TriangularPrism) geometricFigure).isRealTriangularPrism())
                    ((TriangularPrism) geometricFigure).printVolumeFigure();
            }
        }

        if (geometricFigure instanceof Rectangle) {
            if (((Rectangle) geometricFigure).isRealRectangle()) {
                ((Rectangle) geometricFigure).definitionRectangleType();
            }

            if (geometricFigure instanceof Parallelogram) {
                if (((Parallelogram) geometricFigure).isRealParallelogram())
                    ((Parallelogram) geometricFigure).printVolumeFigure();
            }
        }
        System.out.println();
    }
}
