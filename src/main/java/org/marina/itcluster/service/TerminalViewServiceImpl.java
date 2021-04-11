package org.marina.itcluster.service;

public class TerminalViewServiceImpl implements TerminalViewService {

    public void printCountedWords(int[] counters) {
        System.out.println(
                "В тексте "
                        + counters[0] + " слов длиной в три символа, "
                        + counters[1] + " в пять символов и "
                        + counters[2] + " в семь.");
    }
}
