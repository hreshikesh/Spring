package com.xworkz.dsa.collection;

import java.security.SecureRandom;

public class Password{

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+<>?";

    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("Password length should be at least 8");
        }

        String allChars = LOWER + UPPER + DIGITS + SPECIAL;
        StringBuilder password = new StringBuilder(length);

        // Ensure at least one character from each category
        password.append(getRandomChar(LOWER));
        password.append(getRandomChar(UPPER));
        password.append(getRandomChar(DIGITS));
        password.append(getRandomChar(SPECIAL));

        // Fill remaining length
        for (int i = 4; i < length; i++) {
            password.append(getRandomChar(allChars));
        }

        // Shuffle to avoid fixed pattern
        return shuffle(password.toString());
    }

    private static char getRandomChar(String source) {
        return source.charAt(random.nextInt(source.length()));
    }

    private static String shuffle(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int randomIndex = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String password = generatePassword(12);
        System.out.println("Generated Password: " + password);
    }
}