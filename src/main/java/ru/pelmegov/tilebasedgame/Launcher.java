package ru.pelmegov.tilebasedgame;

public class Launcher {

    public static void main(String[] args) {
        Game game = new Game("Tile Game", 400, 400);
        game.start();
    }

}