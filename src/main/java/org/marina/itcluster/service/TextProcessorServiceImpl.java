package org.marina.itcluster.service;

import org.marina.itcluster.model.Book;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessorServiceImpl implements TextProcessorService {
    private CharProvider charProvider = new RandomCharProvider();

    public int[] countWords(Book book) {
        String[] words = book.getText().split(" ");
        int count3CharWord = 0;
        int count5CharWord = 0;
        int count7CharWord = 0;
        for (String word : words) {
            if (word.length() == 3) {
                count3CharWord++;
            }
            if (word.length() == 5) {
                count5CharWord++;
            }
            if (word.length() == 7) {
                count7CharWord++;
            }

        }
        return new int[]{count3CharWord, count5CharWord, count7CharWord};

    }

    public int countSentences(Book book) {
        String[] sentences = book.getText().split("\\.");
        return sentences.length;
    }

    public String[] capitalOddSentence(Book book) {
        String[] sentences = book.getText().split("\\.");

        for (int i = 0; i < sentences.length; i++) {
            if ((i + 1) % 2 == 0) {
                sentences[i] = sentences[i].toUpperCase();
            }
        }
        return sentences;
    }


    public String[] replaceVowel(Book book) {
        String[] sentences = book.getText().split("\\.");
        for (int i = 0; i < sentences.length; i++) {
            if ((i + 1) % 3 == 0) {
                String randomVowelString = charProvider.randomVowelChar();
                sentences[i] = sentences[i].replaceAll("[eyuioaEYUIOA]", randomVowelString);
            }
        }
        return sentences;

    }

    public String concatenateLast3(Book book) {

        String[] sentences = book.getText().split("\\.");
        StringBuilder sb = new StringBuilder();
        sb.append(sentences[sentences.length - 3].trim()).append(", ");
        sb.append(sentences[sentences.length - 2].trim()).append(", ");
        sb.append(sentences[sentences.length - 1].trim()).append(".");
        return sb.toString();


    }

    public int dateFind(Book book) {

        Pattern pattern = Pattern.compile("(\\d{4}\\-\\d{1,2}\\-\\d{1,2})|(\\d{4})");
        Matcher matcher = pattern.matcher(book.getText());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;

    }

    public String reverseSentence(Book book) {

        String[] sentences = book.getText().split("\\.");
        String sentence = sentences[16].trim();
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString();

    }

    public int sumNumbers(Book book) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(book.getText());
        int sum = 0;
        while (matcher.find()) {
            String number = matcher.group();
            int num = Integer.parseInt(number);
            sum += num;
        }
        return sum;
    }

    public CharProvider getCharProvider() {
        return charProvider;
    }

    public void setCharProvider(CharProvider charProvider) {
        this.charProvider = charProvider;
    }
}
