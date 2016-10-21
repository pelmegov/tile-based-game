package ru.pelmegov.tilebasedgame.tiles;

import ru.pelmegov.tilebasedgame.gfx.Assets;

public class TreeDeadTile extends Tile {
    public TreeDeadTile(int id) {
        super(Assets.tree_dead, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
