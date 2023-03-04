package timecheck;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AppTimeCheck {
    public static void main(String[] args) {

        LinkedList<KolejnaKlasaBook> listaKsiazek = new LinkedList<>();

        for (int i = 0; i < 2000000; i++) {

            KolejnaKlasaBook nowaKsiazka = new KolejnaKlasaBook("ksiazka autora nr: " + i, " o tytule nr: " + i);
            listaKsiazek.add(nowaKsiazka);
        }

        long begin = System.nanoTime();
        listaKsiazek.remove(0);
        long end = System.nanoTime();
        System.out.println("Time elapsed in nanoseconds for removing first = " + (end - begin));

        begin = System.nanoTime();
        listaKsiazek.remove(listaKsiazek.size() - 1);
        end = System.nanoTime();
        System.out.println("Time elapsed in nanoseconds for removing last = " + (end - begin));

        HashMap<Integer, KolejnaKlasaBook> mapaKsiazek = new HashMap<Integer, KolejnaKlasaBook>();

        for (int i = 0; i < 2000000; i++) {
            KolejnaKlasaBook innaNowaKsiazka = new KolejnaKlasaBook("Autora " + i, " o tytule " + i);
            mapaKsiazek.put(i, innaNowaKsiazka);
        }
        begin = System.nanoTime();
        String title = mapaKsiazek.get(124356).getTitle();
        end = System.nanoTime();
        System.out.println("finding book " + title + " time elapsed: " + (end- begin));

        begin = System.nanoTime();
        mapaKsiazek.remove(103434);
        end = System.nanoTime();
        System.out.println("time elapsed removing: " + (end- begin));

        begin = System.nanoTime();
        mapaKsiazek.put(120455, new KolejnaKlasaBook("Autora nowego", "o tytule nowym"));
        end = System.nanoTime();
        System.out.println("time elapsed adding: " + (end- begin));
        System.out.println("book added " + mapaKsiazek.get(120455).getAuthor() + mapaKsiazek.get(120455).getTitle());
    }
}
