public class Classroom {

    public static void main(String[] args) {

        Student s1 = new Student("Jake", 3.6);
        Student s2 = new Student();
        Student s3 = new Student("Madi", 4.0);

        Book b1 = new Book("How to pass this class", 15.99);
        Book b2 = new Book("Java for dummies", 10.99);
        Book b3 = new Book("If java doesn't work for you, try this job instead", 99.99);

        s1.addBook(b1, 1);
        s1.addBook(b2, 0);
        s1.addBook(b3, 2);

        s1.showStudent();

        s2.addBook(b1, 0);
        s2.addBook(b2, 1);

        s2.showStudent();

        s3.addBook(b1, 0);

        s3.showStudent();



    }

}
