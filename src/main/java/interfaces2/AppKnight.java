package interfaces2;

public class AppKnight {
    public static void main(String[] args) {
        //tutaj też nie wiem co się odpierdala do końca
        Quest elite = new EliteKnightQuest();
        Quest dead = new DeadIslandQuest();
        Knight knightAndrew = new Knight(dead);


        // Knight knightAndrew = new Knight(new EliteKnightQuest()); <- można też tak

        knightAndrew.doQuest();

    }
}
