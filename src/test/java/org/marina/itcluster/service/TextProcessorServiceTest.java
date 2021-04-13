package org.marina.itcluster.service;

import org.junit.Test;
import org.marina.itcluster.model.Book;

import static org.junit.Assert.assertEquals;

public class TextProcessorServiceTest {

    TextProcessorService textProcessorService = new TextProcessorServiceImpl();
    Book testBook = new Book();

    @Test
    public void shouldAnswerWithTrueCountWords() {

        testBook.setText("ddd kkk aaaaa qazwsxed rfvtgby");

        int[] counters = textProcessorService.countWords(testBook);

        assertEquals(2, counters[0]);
        assertEquals(1, counters[1]);
        assertEquals(1, counters[2]);
    }

    @Test
    public void shouldAnswerWithTrueCountSentence(){

        testBook.setText("Vejhfj jhkfe n. jdiej. Hjbhdfgiefkwefefgg cnhf. ehdie.");

        int count = textProcessorService.countSentences(testBook);

        assertEquals(4, count);

    }

    @Test
    public void shouldAnswearWithTrueCapitalOdd(){
        testBook.setText("vhfgkerhf. bf.");

        String[] sentences = textProcessorService.capitalOddSentence(testBook);

        assertEquals(" BF", sentences[1]);
    }

}
