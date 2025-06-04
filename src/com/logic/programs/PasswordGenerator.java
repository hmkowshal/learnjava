package com.logic.programs;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {

    public static void main(String[] args) {

        // Using Supplier to generate a 12-character random password
        Supplier<String> generateRandomPassword = () -> {
            int length = 12;
            int startCharRange = 33;
            int endCharRange = 126;
            StringBuilder password = new StringBuilder();
            Random rand = new Random();

            for (int i = 0; i < length; i++) {
                int charIndex = rand.nextInt(endCharRange - startCharRange + 1) + startCharRange;
                password.append((char) charIndex);
            }

            return password.toString();
        };

        System.out.println(generateRandomPassword.get());
    }
}
