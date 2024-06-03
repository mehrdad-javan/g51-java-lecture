package se.lexicon;

public class LoopsDemo {

    public static void main(String[] args) {

        // While Loop
        int count = 10;
        /*while (count <= 5) {
            System.out.println("Iteration: " + count);
            count++;
        }*/


        /*do {
            System.out.println("Iteration: " + count);
            count++;
        } while (count <= 5);*/

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
        System.out.println("Done");


        int number = 20;
        for (int i = 1; i<=number; i++){
            if( i % 2 == 0){
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }


    }


}
