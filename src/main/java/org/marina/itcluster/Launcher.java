package org.marina.itcluster;

import org.marina.itcluster.model.Book;
import org.marina.itcluster.service.TerminalViewService;
import org.marina.itcluster.service.TerminalViewServiceImpl;
import org.marina.itcluster.service.TextProcessorServiceImpl;

public class Launcher {
    public static void main(String[] args) {
        Book book = new Book();
        TextProcessorServiceImpl textProcessorService = new TextProcessorServiceImpl();
        TerminalViewService terminalViewService = new TerminalViewServiceImpl();
        
        int[] counters = textProcessorService.countWords(book);
        terminalViewService.printCountedWords(counters);

        textProcessorService.countSentences();
        textProcessorService.capitalOddSentence();
        textProcessorService.replaceVowel();
        textProcessorService.concatenateLast3();
        textProcessorService.dateFind();
        textProcessorService.reverseSentence();
        textProcessorService.sumNumbers();
    }
}
