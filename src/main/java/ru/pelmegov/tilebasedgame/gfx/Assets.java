package ru.pelmegov.tilebasedgame.gfx;

import java.awt.image.BufferedImage;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage player, grass, grass_stone, grass_bags, tree, tree_chomp, tree_dead, road_h, road_v, road_vh;

    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tileset.png"));

        grass = sheet.crop(0, 0, width, height);
        grass_stone = sheet.crop(width, 0, width, height);
        grass_bags = sheet.crop(width * 2, 0, width, height);
        tree = sheet.crop(0, height, width, height);
        tree_chomp = sheet.crop(width, height, width, height);
        tree_dead = sheet.crop(width * 2, height, width, height);
        road_h = sheet.crop(0, height * 2, width, height);
        road_v = sheet.crop(width, height * 2, width, height);
        road_vh = sheet.crop(width * 6, height * 2, width, height);

        SpriteSheet sheet_player = new SpriteSheet(ImageLoader.loadImage("/textures/player.png"));
        player = sheet_player.crop(0, 0, 23, 44);
    }
}
