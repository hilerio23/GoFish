package com.example.gofish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gofish.game.GameFramework.GameMainActivity;
import com.example.gofish.game.GameFramework.LocalGame;
import com.example.gofish.game.GameFramework.gameConfiguration.GameConfig;
import com.example.gofish.game.GameFramework.infoMessage.GameState;

public class MainActivity extends GameMainActivity {

    // We need to override the abstract methods from GameMainActivity
    //I can see what that looks like in the TTTMainActivity

    /**
     * Sets up a default of one human and one computer player
     */
    @Override
    public GameConfig createDefaultConfig() {
        return null;
    }

    /**
     *
     */
    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return null;
    }
}

//Start pulling in your classes and other classes you made
//Make GameState extend GameState from the gameframework
//You can go back to the game interface and find the xml and it can get copied in
//this would go into the human player
//View portion is optional
//Need move actions methods
//You'll need one human player and two computer players
//Need to import game state as though it is extending game state

//Challenges
//1 what are all the pieces of the game framework
//2 Integrate the functionality of your user interface into the game-config-main.xml style
//where the human player controls that
//3 take your game state assignment and pull that functionality into the right places