package booklibrary;

import ArrayListsLinkedLists.Book;

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
        return bookYearOfPublishing; //jak zdefiniowac unikalny hascode tutaj, czy nie trzeba unikalnego?
    }

    @Override
    public boolean equals(Object o) {
        BookClass e = (BookClass) o; // jak dokładnie działa ta linia kodu po kolei? Dlaczego "o" jest poza nawiasem (BookClass)?
        return this.bookTitle.equals(e.getBookTitle()) &&
                this.bookAuthor.equals(e.getBookAuthor()) &&
                this.bookYearOfPublishing.equals(e.getBookYearOfPublishing());

    }

}

