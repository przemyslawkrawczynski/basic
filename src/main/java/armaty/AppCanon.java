package armaty;

import java.util.LinkedList;

public class AppCanon {
    public static void main(String[] args) {

        LinkedList<Cannon> armatki = new LinkedList<Cannon>();
        Cannon armatka1 = new Cannon(false);
        Cannon armatka2 = new Cannon(false);
        Cannon armatka3 = new Cannon(false);
        Cannon armatka4 = new Cannon(false);

        armatki.add(armatka1);
        armatki.add(armatka2);
        armatki.add(armatka3);
        armatki.add(armatka4);

        for (Cannon armata : armatki) {
            armata.setLoaded(true);
            armata.fire();
            armata.setLoaded(false);
        }

        armatka1.fire();

        boolean loaded = armatka1.isLoaded;

        System.out.println(loaded);

    }

}
