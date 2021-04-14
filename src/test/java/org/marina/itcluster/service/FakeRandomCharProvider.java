package org.marina.itcluster.service;

public class FakeRandomCharProvider implements CharProvider {
    @Override
    public String randomVowelChar() {
        return "FRV";
    }
}
