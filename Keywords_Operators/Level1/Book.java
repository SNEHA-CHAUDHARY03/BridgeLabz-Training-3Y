public class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Alice", "ISBN123");
        if (b1 instanceof Book) {
            b1.displayDetails();
        }
        displayLibraryName();
    }
}
