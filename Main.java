import java.sql.Array;
import java.util.ArrayList;

/**
 * A main class that is used to test the Book and the Library classes
 *
 * @author Aswinth sinnathamby
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        // Create books objects with specific attributes
        Book book1 = new Book("The Great Gatsby", "F.Scott Fitzgerald", 10.29, "Scribner", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7.19, "HarperCollins", "9780061120084");
        Book book3 = new Book("1984", "George Orwell", 9.99, "Harvill Secker (Penguin Random House", "9780451524935");
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", 8.99, "Little, Brown and Company", "9780316769488");
        Book book5 = new Book("The Hunger Games", "Suzanne Collins", 10.99, "Scholastic Press", "9780439023528");

        // Create a array list to store the books
        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);
        bookArrayList.add(book5);

        // Create a library object and initialize it
        Library library = new Library(bookArrayList);

        // Search for the books in the library that contain the keyword "4"
        ArrayList<Book> searchResult = library.searchBook("4");
        for (Book book : searchResult) {
            // Prints the details of the book
            System.out.println(book);
        }
    }
}
