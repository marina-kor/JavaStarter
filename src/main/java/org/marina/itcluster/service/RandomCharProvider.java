package org.marina.itcluster.service;

import java.util.Random;

public class RandomCharProvider implements CharProvider {
    String vowels = "qwrtpsdfghjklzxcvbnm";
    Random random = new Random();

    public String randomVowelChar() {
        int randomIndex = random.nextInt(vowels.length());
        char randomVowel = vowels.charAt(randomIndex);
        return String.valueOf(randomVowel);
    }
}
