package com.vcs.baigiamasis;

import com.vcs.baigiamasis.HangmanGame;
import com.vcs.baigiamasis.MaskedWord;

public class Main {

    public static void main(String[] args) {

        HangmanGame game = new HangmanGame();


        MaskedWord outputTest =  game.start();

        System.out.println(outputTest);

        System.out.println( game.guess('g'));
        System.out.println( game.guess('a'));
        System.out.println( game.guess('j'));
        System.out.println( game.guess('z'));
        System.out.println( game.guess('f'));
        System.out.println( game.guess('p'));
        System.out.println( game.guess('i'));
        System.out.println( game.guess('y'));
        System.out.println( game.guess('r'));

    }




}
