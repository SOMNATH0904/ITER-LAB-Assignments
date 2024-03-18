abstract class LibraryResource {
    private String title;
    private String author;

    LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;

    Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    int getPageCount() {
        return pageCount;
    }

    void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    void displayDetails() {
        System.out.println("Book Title : "+getTitle());
        System.out.println("Author : "+getAuthor());
        System.out.println("Page Count : "+getPageCount());
        System.out.println();
    }
}

class Magazine extends LibraryResource {
    private String issueDate;

    Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    String getIssueDate() {
        return issueDate;
    }

    void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    void displayDetails() {
        System.out.println("Magazine Title is : "+getTitle());
        System.out.println("Author : "+getAuthor());
        System.out.println("Issue Date : "+getIssueDate());
        System.out.println();
    }
}

class DVD extends LibraryResource {
    private int duration;

    DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    int getDuration() {
        return duration;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Director: " + getAuthor());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", "John Smith", 500);
        Magazine magazine = new Magazine("Tech Today", "Jane Doe", "January 2024");
        DVD dvd = new DVD("Inception", "Christopher Nolan", 148);

        System.out.println("Library Resources Information --->");
        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
    }
}
