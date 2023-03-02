package whilesum;

import java.util.Random;

public class AppWhileSum {

    public static void main(String[] args) {

        int sumA = 1000;
        int sumB = 0;
        int iterationCounter = 0;

        Random randomIntegerA= new Random();
        Random randomIntegerB= new Random();


        while(sumB < sumA){

            iterationCounter++;
            sumA= sumA + randomIntegerA.nextInt(10);
            sumB = sumB + randomIntegerB.nextInt(50);
            System.out.println("Number of attepmt: " + iterationCounter + " sum A: " + sumA + " sum B: " + sumB);

        }

    }
}
