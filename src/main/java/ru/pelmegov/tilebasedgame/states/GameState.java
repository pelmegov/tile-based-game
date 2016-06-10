package ru.pelmegov.tilebasedgame.states;

import ru.pelmegov.tilebasedgame.Game;
import ru.pelmegov.tilebasedgame.entities.creatures.Player;
import ru.pelmegov.tilebasedgame.gfx.Assets;

import java.awt.*;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class GameState extends State {

    int x = 0;
    Player player;

    public GameState(Game game) {
        super(game);
        player = new Player(game, 100, 100);
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        player.render(g);
    }
}
