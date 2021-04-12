package org.marina.itcluster.service;

import org.marina.itcluster.model.Book;

public interface TextProcessorService {
    int[] countWords(Book book);
    int countSentences(Book book);
    void capitalOddSentence(Book book);
    void replaceVowel(Book book);
    void concatenateLast3(Book book);
    void dateFind(Book book);
    void reverseSentence(Book book);
    void sumNumbers(Book book);
}
