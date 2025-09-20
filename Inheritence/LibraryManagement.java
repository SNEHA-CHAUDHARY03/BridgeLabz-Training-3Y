class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo() {
        System.out.println(title + " " + publicationYear + " " + name + " " + bio);
    }
}
class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author("Java", 2020, "John Doe", "Expert");
        a.displayInfo();
    }
}