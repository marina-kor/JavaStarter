package org.marina.itcluster.service;

import org.marina.itcluster.model.Book;

public interface TerminalViewService {
    void printCountedWords(int[] counters);
    void printCountedSentences(int count);
    void printCapitalOddSentence(String[] sentences);
    void printReplaceVowel(String[] sentences);
    void printConcatenateLast3(String sentences);
    void printDateFind(int count);
    void printReverseSentence(String words);
    void printSumNumbers(int sum);
}
