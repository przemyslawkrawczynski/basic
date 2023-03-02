package literywezykiem;

import javax.sound.midi.Soundbank;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class RandomObjectGenerator {
    public static void main(String[] args) {

        ArrayDeque<String> lettersList = new ArrayDeque<>();

        Random randomNumberofAs = new Random();

        for (int n = 0; n < 50; n++) {
            int random = randomNumberofAs.nextInt(49);
            String a = "a".repeat(random + 1);              //znalazlem taka metode .repeat w internecie,
            // nie wiem czy tego tutaj mozna uzyc czy
            // moze czegos innego
            lettersList.add(a);
            System.out.println("added new object: " + a);

        }

        System.out.println(lettersList.size());

        ObjectsAllocator objectallocator = new ObjectsAllocator();

        objectallocator.allocateToArrayListBasedOnParity(lettersList);

        for (String s : objectallocator.evenLettersList) {
            System.out.println("even is: " + s);

        }

        for (String m : objectallocator.unevenLettersList) {
            System.out.println("uneven is: " + m);

        }

    }
}
