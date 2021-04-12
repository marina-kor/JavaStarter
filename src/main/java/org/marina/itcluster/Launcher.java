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




        textProcessorService.capitalOddSentence(book);
        textProcessorService.replaceVowel(book);
        textProcessorService.concatenateLast3(book);
        textProcessorService.dateFind(book);
        textProcessorService.reverseSentence(book);
        textProcessorService.sumNumbers(book);
    }
}
