package org.marina.itcluster.service;

import org.marina.itcluster.model.Book;

public interface TerminalViewService {
    void printCountedWords(int[] counters);
    void printCountedSentences(int count);
    void capitalOddSentence(String[] sentences);

}
