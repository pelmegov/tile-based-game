package ru.pelmegov.tilebasedgame.tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author modkomi
 * @since 11.06.16
 */
public class Tile {

    // static stuff here

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile grassStoneTile = new GrassStoneTile(1);
    public static Tile treeTile = new TreeTile(2);

    // class

    public static final int TILEWIDTH = 32, TILEHEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }
}
