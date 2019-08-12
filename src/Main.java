import OOP.*;

public class Main {
    public static void main(String[] args) {
        //Triangle
        {
            Triangle triangle = new Triangle();
            Triangle triangle1 = new Triangle(4);
            //Use gets
            System.out.printf("Use gets:%nSide A = %d%nSide B = %d%nSide C = %d%n",
                    triangle1.getA(), triangle1.getB(), triangle1.getC());
            //Use sets
            triangle1.setA(4);
            triangle1.setB(4);
            triangle1.setC(10);
            //isRealFigure
            System.out.println("Triangle is real " + triangle1.isRealFigure());
            triangle1.printExistTriangle();
            triangle1 = triangle;
            System.out.println("Triangle is real " + triangle1.isRealFigure());
            triangle1.printExistTriangle();
            useFigure(triangle1);
            //use scale
            triangle1.toScale(2);
            useFigure(triangle1);

            Triangle triangle2 = new Triangle(Color.BLUE, 12, 12, 6);
            useFigure(triangle2);

            int count = 3;
            Triangle[] triangles = new Triangle[count];
            for (int i = 0; i < count; i++) {
                triangles[i] = new Triangle(i + 1);
            }
            for (Triangle figure : triangles) {
                System.out.println(figure);
                System.out.println();
            }
        }

        //TriangularPrism
        {
            TriangularPrism[] triangularPrisms = new TriangularPrism[4];

            triangularPrisms[0] = new TriangularPrism();
            triangularPrisms[1] = new TriangularPrism(4);
            triangularPrisms[2] = new TriangularPrism(Color.YELLOW, 12, 16, 10, 15);
            triangularPrisms[3] = new TriangularPrism(12, 61, 15, 0);

            for (TriangularPrism item : triangularPrisms) {
                useFigure(item);
            }
        }

        //Rectangle
        {
            Rectangle[] rectangles = new Rectangle[5];
            rectangles[0] = new Rectangle();
            rectangles[1] = new Rectangle(3);
            rectangles[2] = new Rectangle(2, 0);
            rectangles[3] = new Rectangle(Color.RED, 6, 0);
            rectangles[4] = new Rectangle(Color.RED, 6, 5);
            for (Rectangle item : rectangles) {
                useFigure(item);
            }
        }
        //Parallelogram
        {

            Parallelogram[] parallelograms = new Parallelogram[6];
            parallelograms[0] = new Parallelogram();
            parallelograms[1] = new Parallelogram(5);
            parallelograms[2] = new Parallelogram(2, 0);
            parallelograms[3] = new Parallelogram(1, 4, 6);
            parallelograms[4] = new Parallelogram(Color.PINK, 11, 14, 16);
            parallelograms[5] = parallelograms[4];
            parallelograms[5].setColor(Color.GREEN);

            for (Parallelogram item : parallelograms
            ) {
                useFigure(item);
            }
        }
    }

    private static void useFigure(GeometricFigure geometricFigure) {
        System.out.println(geometricFigure);
        geometricFigure.printPerimeterFigure();
        geometricFigure.printAreaFigure();
        if (geometricFigure instanceof Triangle || geometricFigure instanceof Rectangle) {
            //Определяем тип фигуры
            geometricFigure.definitionFigureType();
        }

        if (geometricFigure instanceof Parallelogram || geometricFigure instanceof TriangularPrism) {
            //выводим обьем
            ((VolumeFigure) geometricFigure).printVolumeFigure();
        }
        System.out.println();
    }
}
