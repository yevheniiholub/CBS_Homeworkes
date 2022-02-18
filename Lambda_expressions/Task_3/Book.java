package Lambda_expressions.Task_3;

public class Book {
    private String author;
    private int pagesCount;
    private String bookName;

    public Book(String author, int pagesCount, String bookName) {
        this.author = author;
        this.pagesCount = pagesCount;
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
