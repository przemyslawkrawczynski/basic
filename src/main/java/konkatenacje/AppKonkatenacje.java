package konkatenacje;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AppKonkatenacje {

    public static void main(String[] args) {

        ArrayList<String> companies = new ArrayList<>(); //kiedy po prawej stronie w < > dodaję znowu "String", a kiedy nie trzeba?
        companies.add("Dell");
        companies.add("Apple");
        companies.add("Samsung");
        companies.add("Sony");
        companies.add("Alcatel");

        String concatenated = "";

        for (int i = 0; i < companies.size()-1; i++) {
            concatenated = concatenated + companies.get(i) + ", "; //tu musialem kombinowac z pustą String "concatenate"

        }

        System.out.println(concatenated + companies.get(companies.size()-1)); //tutaj musialem kombinowac zeby ostatnia pozycja byla bez przecinka

    }
}
