package ru.pelmegov.tilebasedgame;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class Launcher {

    public static void main(String[] args) {
        Game game = new Game("Tile Game", 400, 400);
        game.start();
    }

}