package com.vcs.hangman.v2.functionality;

public class HangmanGame {

    private String youWin = "You win!";


    public static final int MAXTRIES = 5;

    private String word;
    private String wordMasked;

    private int misscounter;


    private Dictionary dict = new Dictionary();


    public MaskedWord start() {
        word = dict.giveRandomWord();
        wordMasked = createMask(word);

        misscounter = 0;

        MaskedWord result = new MaskedWord(wordMasked, misscounter, MAXTRIES);

        return result;
    }

    private String createMask(String word) {

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            result += "-";
        }

        return result;

    }


    public MaskedWord guess(char guessedLetter) {

        boolean containsLetter = false;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == guessedLetter) {
                containsLetter = true;

                String newMask = "" + wordMasked.subSequence(0, i);
                newMask += guessedLetter;
                newMask += wordMasked.subSequence(i + 1, wordMasked.length());

                wordMasked = newMask;
            }
        }

        if (!containsLetter) {
            misscounter++;
        }

        return new MaskedWord(wordMasked, misscounter, MAXTRIES);
    }

    public boolean gameWon() {
        return (wordMasked.intern() == word.intern());


    }

    public int getMissCounter() {
        return misscounter;
    }

    public boolean isGameOVer() {
        return misscounter > MAXTRIES;
    }


}
