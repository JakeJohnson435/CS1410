

public class Student {

    private String name;
    private double GPA;

    public void setName(String name){
        this.name = name;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public Student(){
        name = "Bob";
        GPA = 2.6;
        books = new Book[3];
    }

    public Student(String name){
        this.name = name;
        GPA = 2.6;
        books = new Book[3];
    }

    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
        books = new Book[3];
    }

    public void showStudent(){
        System.out.println("Name: " + name + ".\nGPA: " + GPA + ".");
        System.out.println("Books on loan:");
        showBooks();
    }

    private Book books[];

    public void Book(){
        books = new Book[3];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book, int index){
        books[index] = book;
    }

    public void showBooks(){
        for (int i = 0; i < books.length; i++){
            if (books[i]==null){
                System.out.println("Book not assigned");
            } else {
                System.out.println(books[i].getTitle() + "\n" + books[i].getCost());
            }
        }
    }


}
