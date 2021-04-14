package org.marina.itcluster;

import org.marina.itcluster.model.Book;
import org.marina.itcluster.service.TerminalViewService;
import org.marina.itcluster.service.TerminalViewServiceImpl;
import org.marina.itcluster.service.TextProcessorService;
import org.marina.itcluster.service.TextProcessorServiceImpl;

public class Launcher {
    public static void main(String[] args) {
        Book book = new Book();
        TextProcessorService textProcessorService = new TextProcessorServiceImpl();
        TerminalViewService terminalViewService = new TerminalViewServiceImpl();
        
        int[] counters = textProcessorService.countWords(book);
        terminalViewService.printCountedWords(counters);

        int count = textProcessorService.countSentences(book);
        terminalViewService.printCountedSentences(count);


        String[] sentences = textProcessorService.capitalOddSentence(book);
        terminalViewService.printCapitalOddSentence(sentences);

        String[] vowelSentences = textProcessorService.replaceVowel(book);
        terminalViewService.printReplaceVowel(sentences);


        String concatenateSentences = textProcessorService.concatenateLast3(book);
        terminalViewService.printConcatenateLast3(concatenateSentences);


        int dateCount = textProcessorService.dateFind(book);
        terminalViewService.printDateFind(dateCount);


        String words = textProcessorService.reverseSentence(book);
        terminalViewService.printReverseSentence(words);


        int sum = textProcessorService.sumNumbers(book);
        terminalViewService.printSumNumbers(sum);
    }
}
