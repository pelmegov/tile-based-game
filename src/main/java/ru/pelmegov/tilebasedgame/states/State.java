package ru.pelmegov.tilebasedgame.states;

import ru.pelmegov.tilebasedgame.Game;

import java.awt.*;

/**
 * @author modkomi
 * @since 09.06.16
 */
public abstract class State {
    private static State currentState = null;

    public static void setState(State state) {
        currentState = state;
    }

    public static State getState() {
        return currentState;
    }

    protected Game game;

    public State(Game game) {
        this.game = game;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
