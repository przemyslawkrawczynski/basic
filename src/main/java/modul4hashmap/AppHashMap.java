package modul4hashmap;

import java.util.HashMap;
import java.util.Map;

public class AppHashMap {

    public static void main(String[] args) {

        HashMap <Integer, String> myFavouriteColors = new HashMap<Integer, String>();
        HashMap <Integer, String> myFriendsFavouriteColors = new HashMap<Integer, String>();
        HashMap <Integer, String> ourFavouriteColors = new HashMap<Integer, String>();

        myFavouriteColors.put(1, "Red");
        myFavouriteColors.put(2, "Green");
        myFavouriteColors.put(3, "Black");

        myFriendsFavouriteColors.put(4, "White");
        myFriendsFavouriteColors.put(5, "Blue");
        myFriendsFavouriteColors.put(6, "Orange");

        for(Map.Entry<Integer, String> entry :myFavouriteColors.entrySet()){

            ourFavouriteColors.put(entry.getKey(), entry.getValue());
        }


        for(Map.Entry<Integer, String> entry :myFriendsFavouriteColors.entrySet()){

            ourFavouriteColors.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, String> entry :ourFavouriteColors.entrySet()){

            System.out.println(entry.getKey() + " " +  entry.getValue());
        }

    }
}
