package ru.pelmegov.tilebasedgame.tiles;

import ru.pelmegov.tilebasedgame.gfx.Assets;

/**
 * @author modkomi
 * @since 11.06.16
 */
public class TreeDeadTile extends Tile {
    public TreeDeadTile(int id) {
        super(Assets.tree_dead, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
