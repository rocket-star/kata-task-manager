package com.company.fake;

import com.company.interfaces.IHMInterface;

import java.util.ArrayList;
import java.util.List;

public class FakeIHM implements IHMInterface {

    private List<String> printedWords =  new ArrayList<>();

    @Override
    public void write(String message) {
        printedWords.add(message);
    }

    public List<String> getPrintedWords() {
        return printedWords;
    }
}
