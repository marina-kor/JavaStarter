package org.marina.itcluster.service;

import org.marina.itcluster.model.Book;

public interface TextProcessorService {
    int[] countWords(Book book);
    int countSentences(Book book);
    String[] capitalOddSentence(Book book);
    String[] replaceVowel(Book book);
    String concatenateLast3(Book book);
    int dateFind(Book book);
    String reverseSentence(Book book);
    int sumNumbers(Book book);
}
