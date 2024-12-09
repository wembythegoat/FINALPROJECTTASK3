import java.util.ArrayList;

/**
 * This class represents a collection of books
 *
 * @author Aswinth Sinnathamby
 * @version 1.0
 */

public class Library {
    // Instance variable to hold array of books
    private ArrayList<Book> books;

    // Default constructor to initialize library
    public Library() {
        this.books = new ArrayList<>();
    }

    // Constructor to initialize the library with books
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    // Copy constructor to create a new library object
    public Library(Library otherLibrary) {
        this.books = new ArrayList<>(otherLibrary.books);
    }

    // Method to search for books
    public ArrayList<Book> searchBook(String booklet) {
        ArrayList<Book> searchResults = new ArrayList<>();

        // For loop
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(booklet.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(booklet.toLowerCase())) {
                searchResults.add(book);

            }
        }
        // Returns a list of books that match the search keyword
        return searchResults;

    }

    // Methods to check if 2 library obj are equal
    public boolean equals(Object obj) {

        // Same obj
        if (this == obj) return true;

        // Different obj
        if (obj == null || getClass() != obj.getClass()) return false;
        Library library = (Library) obj;
        return books.equals(library.books);

    }

    // Method to return a string form of the books
    public String toString() {
        // Returns a formatted string form of the books
        return String.format("%s", books);
    }

    // Method to get the list of books
    public ArrayList<Book> getBooks() {
        // returns the list of books
        return books;
    }

    // Method to set the list of books
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}