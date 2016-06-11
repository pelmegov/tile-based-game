package ru.pelmegov.tilebasedgame.tiles;

import ru.pelmegov.tilebasedgame.gfx.Assets;

/**
 * @author modkomi
 * @since 11.06.16
 */
public class TreeChompTile extends Tile {
    public TreeChompTile(int id) {
        super(Assets.tree_chomp, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
