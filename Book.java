public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    public Book(String title) {
        this.title = title;
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book(Book otherBook) {
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
        this.publisher = otherBook.publisher;
        this.isbn = otherBook.isbn;

    }

    public int checkIsbnStatus(String isbn) {
        if (this.isbn.length() == 13) {
            return 0;
        } else if(this.isbn.length() == 17) {
            return 1;
        } else {
            return -1;
            }
        }

    public String toTitleCase(String title, String author) {

      String[] words = Book.this.title.split("");
      Book.this.author.split("");
      String titleCase;


      for (String word : words) {
          if (word.length() > 0) {
              titleCase = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
          }
      }
        return titleCase = title;
    }

