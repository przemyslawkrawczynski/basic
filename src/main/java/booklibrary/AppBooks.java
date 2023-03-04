package booklibrary;

import java.util.HashSet;

public class AppBooks {

    public static void main(String[] args) {

        BookClass booke1 = new BookClass("book1", "author 1", 1990);
        BookClass booke2 = new BookClass("book1", "author 1", 1990);
        BookClass booke3 = new BookClass("book3", "author 3", 1992);
        BookClass booke4 = new BookClass("book4", "author 4", 1993);
        BookClass booke5 = new BookClass("book5", "author 5", 1994);


        boolean areBooks1and2TheSame = booke1.equals(booke2);
        System.out.println(areBooks1and2TheSame);

        HashSet<BookClass> booksSet = new HashSet<BookClass>();
        booksSet.add(booke1);
        booksSet.add(booke2);
        booksSet.add(booke3);
        booksSet.add(booke4);
        booksSet.add(booke5);

        for (BookClass bookItem : booksSet) {
            if (bookItem.bookYearOfPublishing > 1992) {
                System.out.println("Book after 1992 is: " + bookItem.getBookTitle() + " written by " + bookItem.getBookAuthor() + " in " + bookItem.getBookYearOfPublishing());
            }
        }
    }
}

