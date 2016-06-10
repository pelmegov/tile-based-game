package ru.pelmegov.tilebasedgame.entities.creatures;

import ru.pelmegov.tilebasedgame.entities.Entity;

/**
 * @author modkomi
 * @since 09.06.16
 */
public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 2.5f;
    public static final int DEFAULT_CREATURE_WIDTH = 23;
    public static final int DEFAULT_CREATURE_HEIGHT = 44;


    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;

    }

    public void move() {
        x += xMove;
        y += yMove;
    }

    // getters and setters

    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}
