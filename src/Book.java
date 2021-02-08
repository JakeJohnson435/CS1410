public class Book {

    private String title;
    private double cost;

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public void showBook(){
        System.out.println("Title:" + title + ".\nCost: " + cost + ".");
    }

    public Book(String title, double cost){
        this.title = title;
        this.cost = cost;
    }
}
