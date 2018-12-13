package com.vcs.hangman.v2.springboot;

import com.vcs.hangman.v2.functionality.HangmanGame;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class OnlineGames {

    private Map<String, HangmanGame> games = new HashMap<>();

    public Map<String, HangmanGame> getGames() {
        return games;
    }

    public HangmanGame create(String id) {

        if (!games.containsKey(id)) {
            games.put(id, new HangmanGame());
        }

        return games.get(id);

    }

}