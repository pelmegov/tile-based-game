package ru.pelmegov.tilebasedgame.entities.creatures;

import ru.pelmegov.tilebasedgame.Game;
import ru.pelmegov.tilebasedgame.gfx.Assets;

import java.awt.*;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class Player extends Creature {

    private Game game;

    private int speed = 2;

    public Player(Game game, float x, float y) {
        super(x, y);
        this.game = game;
    }

    @Override
    public void tick() {
        if(game.getKeyManager().up) y -= speed;
        if(game.getKeyManager().down) y += speed;
        if(game.getKeyManager().left) x -= speed;
        if(game.getKeyManager().right) x += speed;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) x, (int) y, null);
    }
}
