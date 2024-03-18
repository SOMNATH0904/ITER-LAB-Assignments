class Book {
    int bookId;
    String bookName;
    double price;

    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book ID: "+bookId+" Book Name: "+bookName+" Price: $"+price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", 29.99);
        Book book2 = new Book(102, "Python Programming", 24.99);

        if (book1.equals(book2)) {
            System.out.println("Both books have the same price.");
        } else {
            System.out.println("Books have different prices.");
        }

        System.out.println("Details of Book 1 -->");
        System.out.println(book1);

        System.out.println("Details of Book 2 -->");
        System.out.println(book2);
    }
}
