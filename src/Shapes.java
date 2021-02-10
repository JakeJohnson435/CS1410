//Class composition demonstration
//10-1-2020
//-Dr. G

//As you can see you can create multiple classes in one file as long as you don't make
//more than one "public."

//Why would this be a "bad" idea?

//our driver class for testing
public class Shapes
{

}

class Point
{
    private int x;
    private int y;

    public int count = 0;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //limits the x for a point.
    public void setX(int x){
        if (x < 0){
            this.x = 0;
        } else {
            this.x = x;
        }

        if (x > 10){
            this.x = 10;
        } else {
            this.x = x;
        }
    }

    //limits the y for a point.
    public void setY(int y){
        if (y < 0){
            this.y = 0;
        } else {
            this.y = y;
        }

        if (y > 10){
            this.y = 10;
        } else {
            this.y = y;
        }
    }

    //default constructor.
    public Point(){
        x=0;
        y=0;
    }

    //limiting the area the points can be to between 0 and 10 is done here when creating a point.
    public Point(int x, int y){
        if (x < 0){
            this.x = 0;
        } else if(x > 10){
            this.x = 10;
        } else {
            this.x = x;
        }

        if (y < 0){
            this.y = 0;
        } else if (y > 10){
            this.y = 10;
        } else {
            this.y = y;
        }


    }

    //prints out the location of the point given.
    public void showPoint(){
        System.out.println("x = " + x + "\ny = " + y);
    }

    public boolean isEqual(Point p){
        if (x == p.getX() && y == p.getY()){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEqual(Point p1, Point p2){

        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()){
            return true;
        } else {
            return false;
        }
    }
}

class Line
{
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Line(){
        p1 = new Point(1, 1);
        p2 = new Point(1, 3);
    }

    //Since the points are limited above, they wont be able to go out of bounds here.
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    //This uses points to make a line instead of putting each coordinate in individually.
    public Line(int x1, int y1, int x2, int y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public void showLine(){

        p1.showPoint();
        p2.showPoint();
    }

    //returns true as long as the points do not equal each other, because that would just be a point.
    public static boolean isLine(Line l1){

        boolean line = false;

        if (l1.p1.getX() != l1.p2.getX() && l1.p1.getY() != l1.p2.getY()){
            line = true;
        }

        return line;
    }

    public boolean isLine(){

        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()){
            return false;
        } else {
            return true;
        }
    }

    public int lineLength(){

        int length = 0;

        if (p1.getX() == p2.getX()){
            length = p2.getY() - p1.getY();
        } else {
            length = p2.getX() - p1.getX();
        }

        return length;

    }



}

class Square
{
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void Line(){
        p1 = new Point();
        p2 = new Point();
    }

    public void Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void Line(int x1, int y1, int x2, int y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    private Line l1;
    private Line l2;
    private Line l3;
    private Line l4;

    public Line getL1() {
        return l1;
    }

    public Line getL2() {
        return l2;
    }

    public Line getL3() {
        return l3;
    }

    public Line getL4() {
        return l4;
    }

    public void setL1(Line l1) {
        this.l1 = l1;
    }

    public void setL2(Line l2) {
        this.l2 = l2;
    }

    public void setL3(Line l3) {
        this.l3 = l3;
    }

    public void setL4(Line l4) {
        this.l4 = l4;
    }

    public Square (){
        l1 = new Line(1, 1, 1, 3);
        l2 = new Line(1, 3, 3, 3);
        l3 = new Line(3, 3, 3, 1);
        l4 = new Line(3, 1, 1, 1);
    }

    public Square(Line l1, Line l2, Line l3, Line l4){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    public static boolean isSquare(Square s1){

        boolean square = true;


        if (s1.l1.getP2().getX() != s1.l2.getP1().getX() && s1.l1.getP2().getY() != s1.l2.getP1().getY()){
            square = false;
        }

        if (s1.l2.getP2().getX() != s1.l3.getP1().getX() && s1.l2.getP2().getY() != s1.l3.getP1().getY()){
            square = false;
        }

        if (s1.l3.getP2().getX() != s1.l4.getP1().getX() && s1.l3.getP2().getY() != s1.l4.getP1().getY()){
            square = false;
        }

        if (s1.l4.getP2().getX() != s1.l1.getP1().getX() && s1.l4.getP2().getY() != s1.l1.getP1().getY()){
            square = false;
        }

        return square;
    }

    public boolean isSquare(){

        boolean square = true;


        if (l1.getP2().getX() != l2.getP1().getX() && l1.getP2().getY() != l2.getP1().getY()){
            square = false;
        }

        if (l2.getP2().getX() != l3.getP1().getX() && l2.getP2().getY() != l3.getP1().getY()){
            square = false;
        }

        if (l3.getP2().getX() != l4.getP1().getX() && l3.getP2().getY() != l4.getP1().getY()){
            square = false;
        }

        if (l4.getP2().getX() != l1.getP1().getX() && l4.getP2().getY() != l1.getP1().getY()){
            square = false;
        }

        return square;
    }

    public void showSquare(){
        System.out.println("Line 1 is");
        l1.showLine();
        System.out.println("Line 2 is");
        l2.showLine();
        System.out.println("Line 3 is");
        l3.showLine();
        System.out.println("Line 4 is");
        l4.showLine();
    }

    public double squareArea(){

        if (isSquare()) {
            return l1.lineLength() * 4;
        } else {
            return -1;
        }
    }


}