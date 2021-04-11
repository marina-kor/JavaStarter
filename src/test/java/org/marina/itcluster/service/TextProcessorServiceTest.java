package org.marina.itcluster.service;

import org.junit.Test;
import org.marina.itcluster.model.Book;

import static org.junit.Assert.assertEquals;

public class TextProcessorServiceTest {

    TextProcessorService textProcessorService = new TextProcessorServiceImpl();

    @Test
    public void shouldAnswerWithTrue() {
        Book testBook = new Book();
        testBook.setText("ddd kkk aaaaa qazwsxed rfvtgby");

        int[] counters = textProcessorService.countWords(testBook);

        assertEquals(2, counters[0]);
        assertEquals(1, counters[1]);
        assertEquals(1, counters[2]);
    }
}
