import java.util.ArrayList;

// Base Book class
class Book {
    private int bookID;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public Book(int bookID, String title, String author, String genre) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
    }

    public int getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }
    
    public void displayDetails() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Available: " + isAvailable);
    }
}

// FictionBook extending Book
class FictionBook extends Book {
    public FictionBook(int bookID, String title, String author) {
        super(bookID, title, author, "Fiction");
    }

    @Override
    public void displayDetails() {
        System.out.println("[Fiction] " + getTitle() + " by " + getAuthor());
    }
}

// NonFictionBook extending Book
class NonFictionBook extends Book {
    public NonFictionBook(int bookID, String title, String author) {
        super(bookID, title, author, "Non-Fiction");
    }

    @Override
    public void displayDetails() {
        System.out.println("[Non-Fiction] " + getTitle() + " by " + getAuthor());
    }
}

// User class
class User {
    private int userID;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("You haven't borrowed this book.");
        }
    }
}

// Catalog class
class Catalog {
    private ArrayList<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayDetails();
            }
        }
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        // Adding books
        Book book1 = new FictionBook(1, "Harry Potter", "J.K. Rowling");
        Book book2 = new NonFictionBook(2, "Sapiens", "Yuval Noah Harari");
        catalog.addBook(book1);
        catalog.addBook(book2);

        // Creating users
        User user1 = new User(101, "Alice");
        User user2 = new User(102, "Bob");

        // Borrow and return books
        catalog.displayAvailableBooks();
        user1.borrowBook(book1);
        catalog.displayAvailableBooks();
        user2.borrowBook(book1);
        user1.returnBook(book1);
        user2.borrowBook(book1);
    }
}
