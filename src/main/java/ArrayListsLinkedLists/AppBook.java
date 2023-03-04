package ArrayListsLinkedLists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class AppBook {

    public static void main(String[] args) {
//      W koncu sie udalo, ale utknąłem na początku,
//      bo nie wiedziałem co wpisać w typie LinkedList w "<>" i przez
//      to nie wiedziałem jak wywołać konkretne pole obiektu z klasy Book

        Book book1 = new Book("book1", 2005);
        Book book2 = new Book("book2", 1990);
        Book book3 = new Book("book3", 1995);
        Book book4 = new Book("book4", 1997);
        Book book5 = new Book("book5", 2019);
        Book book6 = new Book("book6", 2010);

        LinkedList<Book> bookList = new LinkedList<>(); // tutaj zamiast "Book" dawałem "Objects"

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

//        czy zadziałałoby tak:
//        bookList.add("book7", 2005); ?

        for (Book bookFromList : bookList) { //tutaj też zamiast "Book" dawałem "Objects"

            if (bookFromList.getBookYear() > 2000) {  //przez to na końcu nie mogłem się dostać do pola .bookYear, ale jak zmieniłem na "Book"

                System.out.println("Book released after 2000 is: " + bookFromList.bookName);
            }

        }

    }
}

//
//
//      Próbowałem coś z HashMapą, ale tego na moment zadania jeszcze nie przerabiałem - stack overflow mnie tu doprowadził
//
//        HashMap<String, Integer> booksList = new HashMap<String, Integer>();
//
//        booksList.put("book1", 1990);
//        booksList.put("book2", 1995);
//        booksList.put("book3", 1990);
//        booksList.put("book4", 1995);
//        booksList.put("book5", 1990);
//        booksList.put("book6", 1995);
//
//        for (Integer books : booksList.values());
//
//        if (books <= 1995){
//
//
//        }



