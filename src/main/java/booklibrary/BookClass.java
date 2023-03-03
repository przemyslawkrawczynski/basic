package booklibrary;

import ArrayListsLinkedLists.Book;

import java.util.Objects;

public class BookClass {

    String bookTitle;
    String bookAuthor;
    Integer bookYearOfPublishing;

    public BookClass(String bookTitle, String bookAuthor, Integer bookYearOfPublishing) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYearOfPublishing = bookYearOfPublishing;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookYearOfPublishing() {
        return bookYearOfPublishing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, bookYearOfPublishing);
    }

    @Override
    public boolean equals(Object o) {
        BookClass e = (BookClass) o;// <- TO JEST RZUTOWANIE, CZYLI MÓWIĘ TRAKTUJ (Object) jako (BookClass)  jak dokładnie działa ta linia kodu po kolei? Dlaczego "o" jest poza nawiasem (BookClass)?
        return this.bookTitle.equals(e.getBookTitle()) &&
                this.bookAuthor.equals(e.getBookAuthor()) &&
                this.bookYearOfPublishing.equals(e.getBookYearOfPublishing());

    }

}

