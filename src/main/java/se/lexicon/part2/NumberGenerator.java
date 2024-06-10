package se.lexicon.part2;

import java.util.Random;

public class NumberGenerator {
    int max; // 2000
    int min; // 500



    public int generateRandomNumberInRange(){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }


    public static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(1000 + 1);
    }


}
