package booklibrary2;

import java.sql.PseudoColumnUsage;
import java.util.ArrayDeque;

public class BookStack {

    public static void main(String[] args) {

        BookClass2 book1 = new BookClass2("book number 1");
        BookClass2 book2 = new BookClass2("book number 2");
        BookClass2 book3 = new BookClass2("book number 3");
        BookClass2 book4 = new BookClass2("book number 4");
        BookClass2 book5 = new BookClass2("book number 5");


        ArrayDeque<BookClass2> booksStack = new ArrayDeque<>();

        booksStack.push(book1);
        booksStack.push(book2);
        booksStack.push(book3);
        booksStack.push(book4);
        booksStack.push(book5);

        System.out.println("Number of books in stack is: " + booksStack.size());
        System.out.println("Books currently in stack are: ");

        for (BookClass2 bookInStack : booksStack) {
            System.out.println(bookInStack.getBookName());

        }
        System.out.println("Deleting books from stack...");

        booksStack.pop(); //tutaj automatycznie bierze element ze stacku ktory byl dodany jako ostatni, czyli na book 5 powinno wykonac
        booksStack.pop();
        booksStack.pop();
        booksStack.pop();
        System.out.println("Books left in stack are: \n" + booksStack.peek().getBookName());
        booksStack.pop();

        System.out.println("Deleting books from stack COMPLETED");

        System.out.println("Number of books in stack is: \n" + booksStack.size());

        for (BookClass2 bookInStack : booksStack) {
            System.out.println(bookInStack.getBookName());

        }

    }
}
