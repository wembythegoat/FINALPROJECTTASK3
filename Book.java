/**
 * This class represents a book
 *
 * @author Aswinth Sinnathamby
 * @version 1.0
 */
public class Book {

    // Instance variables
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    // Default constructor to initialize the book
    public Book() {

        // Constructors of all elements of a book
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    // Constructor to initialize the book with a title
    public Book(String title) {

        // Title of the book
        this.title = title;
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    // Constructor to initialize all 5 elements
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    // Copy constructor to create a new book
    public Book(Book otherBook) {
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
        this.publisher = otherBook.publisher;
        this.isbn = otherBook.isbn;

    }

    // Method to check the status of the ISBN
    public int checkIsbnStatus(String isbn) {

        if (this.isbn.length() == 13) {
            // ISBN is 13 digits long
            return 0;
        } else if (this.isbn.length() == 17) {
            // ISBN is 17 digits long
            return 1;
        } else {
            // ISBN is not a valid length
            return -1;
        }
    }

    // Method to convert a string to title case
    public String toTitleCase(String input) {
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        }

        return result.trim();
    }

    // Method to return a string form of the 5 elements of a book
    public String toString() {
        return String.format("%-29s:%s%-30s:%s%-30s:%.2f$%-30s:%s%-30s:%s", "Title", title, "\nAuthor", author, "\nPrice", price, "\nPublisher", publisher, "\nISBN", isbn);
    }

    // Method to check if 2 book objects are equal
    public boolean equals(Book object) {

        // If statement
        if (this == object) {
            // Same object
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            // Different classes
            return false;
        }

        Book book = (Book) object;

        return Double.compare(book.price, price) == 0 &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                publisher.equals(book.publisher) &&
                isbn.equals(book.isbn);

    }

    // Method to create a copy of the book
    public Book clone() {
        return new Book(this);

    }

    // Method to set the title of the book
    public void setTitle(String title) {
        this.title = title;
    }

    // Method to get the title
    public String getTitle() {
        return title;
    }

    // Method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author
    public String getAuthor() {
        return author;
    }

    // Method to set the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to get the price
    public double getPrice() {
        return price;
    }

    // Method to set the publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Method to get the publisher
    public String getPublisher() {
        return publisher;
    }

    // Method to set the ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Method to get the ISBN
    public String getIsbn() {
        return isbn;
    }
}

