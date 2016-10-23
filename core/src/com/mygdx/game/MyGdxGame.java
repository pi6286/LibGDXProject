package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.Splash;

public class MyGdxGame extends Game
{
    public static final String TITLE = "Test", VERSION = "0.0.0.1";

    @Override
    public void create()
    {
        setScreen(new Splash());
    }

    @Override
    public void render()
    {
        super.render();
    }

    @Override
    public void dispose()
    {
        super.dispose();
    }
}