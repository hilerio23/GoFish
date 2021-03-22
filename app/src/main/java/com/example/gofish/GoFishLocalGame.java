package com.example.gofish;

import com.example.gofish.game.GameFramework.LocalGame;
import com.example.gofish.game.GameFramework.actionMessage.GameAction;
import com.example.gofish.game.GameFramework.players.GamePlayer;

public class GoFishLocalGame extends LocalGame {
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

    }

    @Override
    protected boolean canMove(int playerIdx) {
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }
}

