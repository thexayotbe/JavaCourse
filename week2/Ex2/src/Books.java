import java.util.ArrayList;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public String toString() {
        return "Author[name  = " + name + ", email = " + email + ", gender = " + gender + "]";
    }

}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String toString() {
        return "Book[name = " + name + ", author = " + author.toString() + ", price = " + price + ", qty = " + qty + "]";
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateQty(String bookname, int qty) {
        for (Book book : books) {
            if (book.getName().equals(bookname)) {
                book.setQty(qty);
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe", "john@doe.com", 'M');
        Author author2 = new Author("Jane Doe", "jane@doe.com", 'F');

        Book book1 = new Book("Java", author1, 10.5, 10);
        Book book2 = new Book("C++", author2, 20.5, 5);


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.updateQty("Java", 20);
        System.out.println("After updating Quantity");
        library.displayBooks();

    }
}