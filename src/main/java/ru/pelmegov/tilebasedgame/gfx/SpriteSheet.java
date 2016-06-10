package ru.pelmegov.tilebasedgame.gfx;

import java.awt.image.BufferedImage;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class SpriteSheet {

    private BufferedImage sheet;

    public SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }

    public BufferedImage crop(int x, int y, int width, int height) {
        return sheet.getSubimage(x, y, width, height);
    }

}
