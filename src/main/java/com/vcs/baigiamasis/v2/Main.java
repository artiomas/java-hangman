package com.vcs.baigiamasis.v2;


public class Main {

    public static void main(String[] args) {

        HangmanGame game = new HangmanGame();


        MaskedWord outputTest =  game.start();

      // boolean win = game.gameWon();
      //  boolean lose = game.isGameOVer();

        //System.out.println(outputTest);

      //   for (int i = 0; i < game.guess(); i++) {}

       // game.gameWon();
       // game.isGameOVer();

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
