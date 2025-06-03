package com.logic.programs;

import java.util.Random;
import java.util.function.Function;

public class PasswordGenerator {

    public static void main(String[] args) {

        //Using Function to input required random text / password length ang get the output
        Function<Integer,String> generateRandomText = inputLength ->{
            int startCharRange = 33;
            int endCharRange = 126;
            String randomText="";
            Random randNum = new Random();
            for(int i=0;i<inputLength;i++){
                int charIndex = randNum.nextInt(endCharRange-startCharRange+1) + startCharRange;
                randomText+= (char) charIndex;
            }
            return randomText;
        };

        System.out.println(generateRandomText.apply(15));
    }
}
