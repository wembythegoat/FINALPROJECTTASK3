import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Book book1 = new Book("The Great Gatsby","F.Scott Fitzgerald", 10.29,"Scribner","9780743273565");
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7.19, "HarperCollins", "9780061120084");
    Book book3 = new Book("1984", "George Orwell", 9.99, "Harvill Secker (Penguin Random House", "9780451524935");
    Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", 8.99, "Little, Brown and Company", "9780316769488");
    Book book5 = new Book("The Hunger Games", "Suzanne Collins", 10.99, "Scholastic Press", "9780439023528");

        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);
        bookArrayList.add(book5);

        Library library = new Library(bookArrayList);

        ArrayList<Book> searchResult = library.searchBook("4");
        for (Book book : searchResult) {
            System.out.println(book);
        }
    }
}
