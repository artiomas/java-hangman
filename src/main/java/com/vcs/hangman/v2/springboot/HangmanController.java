package com.vcs.hangman.v2.springboot;


import com.vcs.hangman.v2.functionality.HangmanGame;
import com.vcs.hangman.v2.functionality.MaskedWord;
import com.vcs.hangman.v2.mainApp.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HangmanController {

    @Autowired
    private OnlineGames oGames;

    @GetMapping("game/start/{id}")
    public OutputJson start(@PathVariable("id") String gameId) {

        HangmanGame game = oGames.create(gameId);

        MaskedWord mw = game.start();

        OutputJson out = new OutputJson();
        out.setGameId(gameId);
        out.setGameStatus((game.gameWon() ? "WIN!!!" : "") + (game.isGameOVer() ? "Looser" : ""));
        out.setLefTries(game.MAXTRIES - game.getMissCounter());
        out.setWord(mw.getMaskedWord());

        return out;
    }

    @GetMapping("game/{id}/guess/{ch}")
    public OutputJson guess(@PathVariable("id") String gameId, @PathVariable("ch") String ch) {


        HangmanGame game = oGames.getGames().get(gameId);

        MaskedWord mw = game.guess(ch.charAt(0));

        OutputJson out1 = new OutputJson();
        out1.setGameId(gameId);
        out1.setGameStatus((game.gameWon() ? "WIN!!!" : "") + (game.isGameOVer() ? "Looser" : ""));
        out1.setLefTries(game.MAXTRIES - game.getMissCounter());
        out1.setWord(mw.getMaskedWord());


        return out1;
    }

}
