package com.vcs.hangman.v2.functionality;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {


    private List<String> words = new ArrayList<>();

    public Dictionary() {

        words.add("champagne");
        words.add("whiteboard");
        words.add("personal");
        words.add("computer");
        words.add("desk");
    }


    public String giveRandomWord() {
        Random rnd = new Random();
        int rndIndex = rnd.nextInt(words.size());
        return words.get(rndIndex);
    }
}
