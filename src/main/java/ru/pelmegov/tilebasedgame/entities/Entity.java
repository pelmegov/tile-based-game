package ru.pelmegov.tilebasedgame.entities;

import java.awt.*;

/**
 * @author modkomi
 * @since 09.06.16
 */
public abstract class Entity {

    protected float x, y;

    public Entity(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
