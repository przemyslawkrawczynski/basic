package ArrayListsLinkedLists;

import java.util.ArrayList;
import java.util.Collections;

public class AverageMarkCalculator {

    public static void main(String[] args) {

        ArrayList<Double> marks = new ArrayList<>(); //tworzę obiekt listy ArrrayList przechowujący zmienne typu double o referencji marks

        marks.add(4.5); //dodaję do tej utworzonej listy "marks" oceny
        marks.add(6.0);
        marks.add(6.0);
        marks.add(2.0);
        marks.add(2.0);
        marks.add(3.5);

        for (Double mark : marks) { //tworze petle - dla zmiennej mark typu Double przypisz kolejno kazdy element z listy marks...

            System.out.println("List contains of: " + mark); //w wykonaj takie dzialani

        }

        marks.remove(Collections.max(marks)); //usuwam wartosc maksymalna z listy marks
        marks.remove(Collections.min(marks)); //usuwam wartosc minimalna z listy marks

        for (Double mark : marks) {

            System.out.println("New list contains of: " + mark);

        }

        Double marksSum = 0.0;

        for (Double mark : marks){

            marksSum = marksSum + mark;

        }

        System.out.println("Sum of marks is: " + marksSum);

        int numberOfMarks = marks.size();

        System.out.println("Number of marks is: " + numberOfMarks);

        double marksAverage = marksSum / numberOfMarks;

        System.out.println("Marks average is: " + marksAverage);

    }
}
//Opcja nr 1 : tutaj dać polecenie, które obetnie listę marks z najmniejszej pozycji
//Opcja nr 1 : tutaj dać metodę, która obetnie listę marks z największej pozycji
//Opcja nr 1: na tej zmodyfikowanej juz petli liczy sie suma i potem srednia
//każda pozycja na liście marks jest przypisywana do zmiennej mark typu Double
//Opcja nr 2: petla zlicza sume pomijajac maksymalne i minimalne, a potem dzieli
//jak zrobic, zeby program usuwal tylko po jednej skrajnej wartosci? - marks.remove(Collections.max(marks)


// if (mark > Collections.min(marks) && mark < Collections.max(marks)) <- takie rozwiazanie w petli powoduje, ze jak beda np same czworki, to nie zsumuje sie nic, wiec odpada
