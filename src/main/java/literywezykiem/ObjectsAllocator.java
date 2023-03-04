package literywezykiem;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ObjectsAllocator {
    ArrayList<String> evenLettersList = new ArrayList<>();
    ArrayList<String> unevenLettersList = new ArrayList<>();

    public void allocateToArrayListBasedOnParity(ArrayDeque<String> lettersList) {

        while (lettersList.size() > 0) {

            String pulledElement = lettersList.poll();

            if (pulledElement.length() % 2 == 0) {

                evenLettersList.add(pulledElement);

            } else {

                unevenLettersList.add(pulledElement);

            }

        }

    }
}
