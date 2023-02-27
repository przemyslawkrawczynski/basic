package loops;

public class AverageApp {

    public static void main(String[] args) {

        int[] table = new int[20];
        table[0] = 1;
        table[1] = 2;
        table[2] = 3;
        table[3] = 4;
        table[4] = 5;
        table[5] = 6;
        table[6] = 7;
        table[7] = 8;
        table[8] = 9;
        table[9] = 10;
        table[10] = 11;
        table[11] = 12;
        table[12] = 13;
        table[13] = 14;
        table[14] = 15;
        table[15] = 16;
        table[16] = 17;
        table[17] = 18;
        table[18] = 19;
        table[19] = 20;

        double tableSum = 0;

        for (int i = 0; i < table.length; i++) {
            tableSum = tableSum + table[i];
            System.out.println("Row number " + i + " is number " + table[i]);

        }
        double tableLength = table.length;
        double tableAverage = tableSum / table.length;

        System.out.println("Sum of this table is: " + tableSum);
        System.out.println("Lenght of this table is: " + tableLength);
        System.out.println("The averge of this table is: " + tableAverage);


    }
}
