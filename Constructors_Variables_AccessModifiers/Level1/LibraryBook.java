public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }
}
