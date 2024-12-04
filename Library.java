import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public Library(Library otherLibrary) {
        this.books = new ArrayList<>(otherLibrary.books);
    }

    public ArrayList<Book> searchBook(String booklet) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) { if (book.getTitle().toLowerCase().contains(booklet.toLowerCase()) ||
            book.getAuthor().toLowerCase().contains(booklet.toLowerCase())) {
            searchResults.add(book);

    }
}
return searchResults;

        }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
    }
    }