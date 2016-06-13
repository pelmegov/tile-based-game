package ru.pelmegov.tilebasedgame.entities.creatures;

import ru.pelmegov.tilebasedgame.Game;
import ru.pelmegov.tilebasedgame.gfx.Assets;

import java.awt.*;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class Player extends Creature {

    public Player(Game game, float x, float y) {
        super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
    }

    @Override
    public void tick() {
        getInput();
        move();
        game.getGameCamera().centerOnEntity(this);
//        if(game.getKeyManager().up) y -= Creature.DEFAULT_SPEED;
//        if(game.getKeyManager().down) y += Creature.DEFAULT_SPEED;
//        if(game.getKeyManager().left) x -= Creature.DEFAULT_SPEED;
//        if(game.getKeyManager().right) x += Creature.DEFAULT_SPEED;
    }

    private void getInput() {
        xMove = 0;
        yMove = 0;

        if(game.getKeyManager().up) {
            yMove = -speed;
        }
        if(game.getKeyManager().down) {
            yMove = +speed;
        }
        if(game.getKeyManager().left) {
            xMove = -speed;
        }
        if(game.getKeyManager().right) {
            xMove = +speed;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) (x - game.getGameCamera().getxOffset()), (int) (y - game.getGameCamera().getyOffset()), width, height, null);
    }
}
