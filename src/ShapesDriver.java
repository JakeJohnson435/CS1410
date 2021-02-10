public class ShapesDriver {

    public static void main(String[] args) {

        //Creating Points, Lines and Squares
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 5);
        Point p3 = new Point(2, 5);
        Point p4 = new Point(5, 5);
        Point p5 = new Point(5, 5);
        Point p6 = new Point(5, 2);
        Point p7 = new Point(5, 2);
        Point p8 = new Point(2, 2);
        Point p9 = new Point(6, 6);
        Point p10 = new Point(6, 6);

        Point p11 = new Point(-1, 13);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);
        Line l3 = new Line(p5, p6);
        Line l4 = new Line(p7, p8);
        Line l5 = new Line(p9, p10);

        //Testing boundaries on points. Since both the x and y are out of bounds it should return (0, 10)
        System.out.println("Testing out of bounds safety. Point given had too low an x and too high a y. Should return with default min/max.");
        p11.showPoint();

        //Output of line length
        System.out.println("The length of line 1 is: ");
        System.out.println(l1.lineLength());

        Square s1 = new Square(l1, l2, l3, l4);
        Square s2 = new Square(l1, l2, l3, l5);

        //testing to make sure the lines are lines. Lines 1-4 should be true, line 5 false.
        System.out.println("Testing to make sure each Line object given is a line:");
        System.out.println(l1.isLine());
        System.out.println(l2.isLine());
        System.out.println(l3.isLine());
        System.out.println(l4.isLine());
        System.out.println(l5.isLine());

        //Testing to make sure the square is square. S1 should be true, S2 false;
        System.out.println("Testing each square object to determine if it is a square:");
        System.out.println(s1.isSquare());
        System.out.println(s2.isSquare(s2));

        //Testing output on the area of a given square. If square given is not a square it will return -1.
        System.out.println("The area of the squares are:");
        System.out.println(s1.squareArea());
        System.out.println(s2.squareArea());

        //Printing points of the square
        System.out.println("The points and lines for the square are:");
        s1.showSquare();

        //testing other constructors for the point/line/square classes
        Point p12 = new Point();
        Line l6 = new Line();
        Square s3 = new Square();

        System.out.println("Printing default point");
        p12.showPoint();
        System.out.println("Printing default line");
        l6.showLine();
        System.out.println("Printing default square");
        s3.showSquare();

    }

}
