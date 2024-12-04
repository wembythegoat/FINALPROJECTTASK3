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

    public String toTitleCase(String input) {
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        }

        return result.trim();
    }

    public String toString() {
        return String.format("%-30s:%s%-30s:%s%-30s:%f%-30s:%s%-30s%s","Title",title,"Author",author,"Price",price,"Publisher",publisher,"ISBN",isbn );
    }
    public boolean equals(Book object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Book book = (Book) object;

        return Double.compare(book.price, price) == 0 &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                publisher.equals(book.publisher) &&
                isbn.equals(book.isbn);

    }

    public Book clone() {
        return new Book(this);

    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}

