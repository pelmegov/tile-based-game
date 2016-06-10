package ru.pelmegov.tilebasedgame.entities.creatures;

import ru.pelmegov.tilebasedgame.entities.Entity;

/**
 * @author modkomi
 * @since 09.06.16
 */
public abstract class Creature extends Entity {

    protected int health;

    public Creature(float x, float y) {
        super(x, y);
        health = 10;
    }

}
