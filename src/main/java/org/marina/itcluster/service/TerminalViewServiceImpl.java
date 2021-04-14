package org.marina.itcluster.service;

import java.util.Arrays;

public class TerminalViewServiceImpl implements TerminalViewService {

    public void printCountedWords(int[] counters) {
        System.out.println(
                "В тексте "
                        + counters[0] + " слов длиной в три символа, "
                        + counters[1] + " в пять символов и "
                        + counters[2] + " в семь.");
    }

    public void printCountedSentences(int count){
        System.out.println("В тексте "
                                    + count  +
                                            " предложений.");
    }
    public void printCapitalOddSentence (String[] sentences) {


        System.out.println("Каждое второе предложение в верхнем регистре: "+ Arrays.toString(sentences));
    }

    public void printReplaceVowel(String[] sentences){
        System.out.println("В каждом третьем предложении гласные заменены на согласные:" + Arrays.toString(sentences));
    }

    public void printConcatenateLast3(String sentences){
        System.out.println("Последние три предложения обьеденены запятыми: "+sentences);

    }

    public void printDateFind(int count){
        System.out.println("Количество дат в тексте: "+count);
    }

    public void printReverseSentence(String words){
        System.out.println("Все слова 17го предложения в обратном порядке: "+words);

    }

    public void printSumNumbers(int sum){
        System.out.println("Сумма чисел в тексте: "+sum);

    }


}
