class Book {
    String title;
    int pages;

    // Constructor
    Book(String t, int p) {
        title = t;
        pages = p;
    }

    // Constructor Overloading
    Book(String t) {
        title = t;
        pages = 1500;
    }

    void showBook() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }

    // Destructor using finalize (not commonly used)
    protected void finalize() {
        System.out.println("Object is destroyed");
    }
}

public class Que2 {
    public static void main(String[] args) {
        Book b1 = new Book("Crime And Punishment", 522);
        Book b2 = new Book("Arthashastra By Kautilya");

        b1.showBook();
        b2.showBook();
    }
}
