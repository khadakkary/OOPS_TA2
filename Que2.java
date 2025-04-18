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
        pages = 100;
    }

    void showBook() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }

    // Destructor using finalize (not commonly used)
    protected void finalize() {
        System.out.println("Object is destroyed");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book("Core Java", 200);
        Book b2 = new Book("OOP Concepts");

        b1.showBook();
        b2.showBook();
    }
}
