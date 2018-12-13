package com.vcs.hangman.v2.functionality;

public class MaskedWord {

    private String maskedWord;
    private int tryCounter;
    private int maxTry;

    public MaskedWord(String maskedWord, int tryCounter, int maxTry) {
        this.maskedWord = maskedWord;
        this.tryCounter = tryCounter;
        this.maxTry = maxTry;
    }

    public boolean isGameOVer(){
        return tryCounter > maxTry;
    }



    public String getMaskedWord() {

        if (isGameOVer()) {
            return  "GAME OVER";
        }

        return maskedWord;
    }

    public void setMaskedWord(String maskedWord) {
        this.maskedWord = maskedWord;
    }

    public int getTryCounter() {
        return tryCounter;
    }

    public void setTryCounter(int tryCounter) {
        this.tryCounter = tryCounter;
    }

    @Override
    public String toString(){

        return getMaskedWord() + " Fails: " + tryCounter + " / " + maxTry;
    }

}
