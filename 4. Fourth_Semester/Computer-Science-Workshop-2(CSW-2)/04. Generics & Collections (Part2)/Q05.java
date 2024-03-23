/**
 * Ques 5 : Create a Class Book that has id, name, author and quantity for each book issued. The Book class should define a parameterised constructor. Design a class Library that create a HashMap of books which contains an entry of key as Integer and value as Book object. Instantiate atleast two Book objects and display the collection of books in the HashMap. Use proper method of HashMap class to return the following things
 * (a.)Check if a particular book name is present in the map
 * (b.) remove the value associated with a particular key value which will remove the book entry.
 */

import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
    }
}
class Library {
    private HashMap <Integer, Book> books;
    public Library() {
        books = new HashMap<>();
    }
    public void addBook(int id, Book book) {
        books.put(id, book);
    }
    public void displayBooks() {
        System.out.println("Library Books:");
        for (HashMap.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
    public boolean containsBook(String bookName) {
        for (Book book : books.values()) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }
    public void removeBook(int id) {
        if (books.containsKey(id)) {
            books.remove(id);
            System.out.println("Book with ID " + id + " removed from the library.");
        } else {
            System.out.println("Book with ID " + id + " not found in the library.");
        }
    }
}
public class Q05 {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book(101, "Java Programming", "jess jonason", 5);
        Book book2 = new Book(102, "DSA", "shreynka patil", 3);
        library.addBook(1, book1);
        library.addBook(2, book2);
        library.displayBooks();
        String searchBookName = "Java Programming";
        if (library.containsBook(searchBookName)) {
            System.out.println("The book '" + searchBookName + "' is present in the library.");
        } else {
            System.out.println("The book '" + searchBookName + "' is not present in the library.");
        }
        int removeId = 2;
        library.removeBook(removeId);
        library.displayBooks();
    }
}

/**
 * OUTPUT :
 *
 * Library Books:
 * ID: 1, Book [id=101, name=Java Programming, author=jess jonason, quantity=5]
 * ID: 2, Book [id=102, name=DSA, author=shreynka patil, quantity=3]
 * The book 'Java Programming' is present in the library.
 * Book with ID 2 removed from the library.
 * Library Books:
 * ID: 1, Book [id=101, name=Java Programming, author=jess jonason, quantity=5]
 */
