package org.marina.itcluster.service;

import org.marina.itcluster.model.Book;

public interface TextProcessorService {
    int[] countWords(Book book);
    void countSentences();
    void capitalOddSentence();
    void replaceVowel();
    void concatenateLast3();
    void dateFind();
    void reverseSentence();
    void sumNumbers();
}
