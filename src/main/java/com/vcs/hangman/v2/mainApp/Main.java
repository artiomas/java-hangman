package com.vcs.hangman.v2.mainApp;


import com.vcs.hangman.v2.functionality.HangmanGame;
import com.vcs.hangman.v2.functionality.MaskedWord;

public class Main {

    public static void main(String[] args) {

        HangmanGame game = new HangmanGame();


        MaskedWord outputTest =  game.start();

        /**
         *
         * BELOW: Game Won
         *
         */

        System.out.println( game.guess('c'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('h'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('a'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('m'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('p'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('a'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('g'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('n'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());
        System.out.println( game.guess('e'));
        System.out.println( game.gameWon());
        System.out.println( game.isGameOVer());


        /**
         *
         *
         * BELOW: Game Over
         *
         *
         */


//        System.out.println( game.guess('c'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('c'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('z'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('u'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('i'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('o'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('h'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('y'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('r'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());
//        System.out.println( game.guess('e'));
//        System.out.println( game.gameWon());
//        System.out.println( game.isGameOVer());

    }




}
