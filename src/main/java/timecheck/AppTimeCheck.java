package timecheck;

import java.util.LinkedList;

public class AppTimeCheck {
    public static void main(String[] args) {

        LinkedList<KolejnaKlasaBook> listaKsiazek = new LinkedList<>();

        for (int i = 0; i < 2000000; i++){

            KolejnaKlasaBook nowaKsiazka = new KolejnaKlasaBook("ksiazka autora nr: " + i, " o tytule nr: " + i);
            listaKsiazek.add(nowaKsiazka);
        }

        long begin = System.nanoTime();
        listaKsiazek.remove(0);
        long end = System.nanoTime();
        System.out.println("Time elapsed in nanoseconds for removing first = " + (end - begin));

        begin = System.nanoTime();
        listaKsiazek.remove(listaKsiazek.size()-1);
        end = System.nanoTime();
        System.out.println("Time elapsed in nanoseconds for removing last = " + (end - begin));

    }
}
