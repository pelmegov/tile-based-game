package ru.pelmegov.tilebasedgame.tiles;

import ru.pelmegov.tilebasedgame.gfx.Assets;

public class GrassStoneTile extends Tile {

    @Override
    public boolean isSolid() {
        return true;
    }

    public GrassStoneTile(int id) {
        super(Assets.grass_stone, id);
    }
}
