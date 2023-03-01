package ArrayListsLinkedLists;

import java.util.LinkedList;

public class Book {

    String bookName;
    Integer bookYear;

    public Book(String bookName, Integer bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
    }

    public Integer getBookYear() {
        return bookYear;
    }
}


//Jak stworzyc liste, ktora bedzie miala dwa typy danych?
// - stworzyć klasę Book
// - LinkedList będzie wtedy listą klas
// - jak tylko przypisać wtedy coś takiego? czy jak zrobię konstruktor takiej klasy to potem w