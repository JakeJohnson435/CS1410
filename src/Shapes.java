//Class composition demonstration
//10-1-2020
//-Dr. G

//As you can see you can create multiple classes in one file as long as you don't make
//more than one "public."

//Why would this be a "bad" idea?

//our driver class for testing
public class Shapes
{
    public static void main(String[] args)
    {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(5, 7);
        Line l1 = new Line(p1, p2);
        l1.showLine();
    }
}

//create a class point with x and y coordinates

//add appropriate getters, setters, and constructors

//add a print method

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

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public Point(){
        x=0;
        y=0;
        count++;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        count++;
    }

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

//create a class line made up of two points

//create private instance variables for upper and lower x and y bounds

//add appropriate getters, and setters

//add point constructors and 4 int constructors

//add a isLine method to make sure it is a legitimate line

//if a user tries to make a line that is not a valid line based on values and on bounds
//set points to null

//add a print method
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
        p1 = new Point();
        p2 = new Point();
    }

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public void showLine(){
        p1.showPoint();
        p2.showPoint();
    }

}

//Demonstrate static vs dynamic methods

//create a class square made up of 4 lines

//add bounds for the square

//add appropriate getters, and setters

//add point and line constructors

//add a isSquare method to make sure it is a legitimate square

//if a user tries to make a square that is not a valid square based on values and on bounds
//set points to null

//add a print method

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
        l1 = new Line();
        l2 = new Line();
        l3 = new Line();
        l4 = new Line();
    }

    public Square(Line l1, Line l2, Line l3, Line l4){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }


}