package com.pandaawake.gourdgame.tiles;

import com.pandaawake.gourdgame.Config;

public class Floor extends Thing {

    public Floor(int id) {
        super(id, false);
        tileTextures.setTileTexture(Config.TileParser.getTile(7, 9));
    }

}
