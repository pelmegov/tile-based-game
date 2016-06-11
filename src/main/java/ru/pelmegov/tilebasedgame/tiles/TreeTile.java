package ru.pelmegov.tilebasedgame.tiles;

import ru.pelmegov.tilebasedgame.gfx.Assets;

/**
 * @author modkomi
 * @since 11.06.16
 */
public class TreeTile extends Tile {
    public TreeTile(int id) {
        super(Assets.tree, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
