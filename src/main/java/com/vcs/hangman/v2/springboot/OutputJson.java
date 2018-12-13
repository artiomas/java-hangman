package com.vcs.hangman.v2.springboot;

public class OutputJson {

    private String word;
    private int lefTries;
    private String gameStatus;
    private String gameId;


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLefTries() {
        return lefTries;
    }

    public void setLefTries(int lefTries) {
        this.lefTries = lefTries;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

}