package org.marina.itcluster.service;

import org.junit.Test;
import org.marina.itcluster.model.Book;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TextProcessorServiceTest {
    TextProcessorServiceImpl textProcessorService = new TextProcessorServiceImpl();
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
    public void shouldAnswerWithTrueCountSentence() {

        testBook.setText("Vejhfj jhkfe n. jdiej. Hjbhdfgiefkwefefgg cnhf. ehdie.");

        int count = textProcessorService.countSentences(testBook);

        assertEquals(4, count);

    }

    @Test
    public void shouldAnswerWithTrueCapitalOdd() {
        testBook.setText("vhfgkerhf. bf.");

        String[] sentences = textProcessorService.capitalOddSentence(testBook);

        assertEquals(" BF", sentences[1]);
    }

    @Test
     public void shouldAnswerWithTrueConvertVowel(){
        testBook.setText("dfeaurt deaaaru. eua. aeurtuey.");
        CharProvider fakeRandomCharProvider = new FakeRandomCharProvider();
        textProcessorService.setCharProvider(fakeRandomCharProvider);


        String[] sentences = textProcessorService.replaceVowel(testBook);

        assertEquals("[dfeaurt deaaaru,  eua,  FRVFRVFRVrtFRVFRVFRV]", Arrays.toString(sentences));
    }



    @Test
     public void shouldAnswerWithTrueConcatenateLast3(){
        testBook.setText("fdf. dfdfwf jfno. fefioejfokemo. nxsgydbw hbdj.");
       String sentences = textProcessorService.concatenateLast3(testBook);
     assertEquals("dfdfwf jfno, fefioejfokemo, nxsgydbw hbdj.", sentences);

    }

    @Test
    public void shouldAnswerWithTrueDateCount() {
        testBook.setText("hfkifh. 1234. dhlwd; ebdjek. 1988-12-12.");
        int count = textProcessorService.dateFind(testBook);

        assertEquals(2, count);
    }


    @Test
    public void shouldAnswerWithReverseSentence() {
        testBook.setText("b. j. j. g. df. kj. li. fg. n. njk. e. y. bh. jh. jk. nj. bnj kjioy nb. n.");
        String words = textProcessorService.reverseSentence(testBook);

        assertEquals("jnb yoijk bn ", words);
    }

    @Test
    public void shouldAnswerWithTrueSum() {
        testBook.setText("hfkifh. 1234. dhlwd; ebdjek. 1988-12-12.");
        int sum = textProcessorService.sumNumbers(testBook);

        assertEquals(3246, sum);
    }


}
