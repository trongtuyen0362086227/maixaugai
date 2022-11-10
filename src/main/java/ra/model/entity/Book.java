package ra.model.entity;

import java.util.List;

public class Book {
    private String bookId;
    private String bookName;
    private float price;
    private String authorName;
    public boolean bookStatus;

    public Book() {
    }

    public Book(String bookId, String bookName, float price, String authorName, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.authorName = authorName;
        this.bookStatus = bookStatus;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorName = authorName;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
}
