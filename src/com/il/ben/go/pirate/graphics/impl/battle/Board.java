package com.il.ben.go.pirate.graphics.impl.battle;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Point;

import com.il.ben.go.pirate.graphics.IInterval;
import com.il.ben.go.pirate.graphics.Layer;
import com.il.ben.go.pirate.graphics.sprite.TileSprite;
import com.il.ben.go.pirate.graphics.tile.Tile;
import com.il.ben.go.pirate.graphics.tile.Tiles;
import com.il.ben.go.pirate.graphics.util.Interval;

public class Board implements Layer, IInterval {

	private Tile[][] tiles = new Tile[15][10];
	private Image sprite;
	private Nature nature;
	
	
	private Interval translate = new Interval();
	
	public Board() {
		this.nature = new Nature();
	
		for (int i = 0; i < this.tiles[0].length; i++) {
			for (int j = 0; j < this.tiles[1].length; j++) {
				this.tiles[i][j] = new Tile(Tiles.BATTLE_BLOCK);
			}
		}
	}
	
	@Override
	public void render(Graphics g) {
		g.translate(this.translate.getX(), this.translate.getY());

		for (int i = 0; i < tiles[0].length; i++) {
			for (int j = 0; j < tiles[1].length; j++) {
				Tile tile = tiles[i][j];
				if (tile == null)
					continue;
				
				int width = tile.getWidth();
				int height = tile.getHeight();
				
				int x = (j * width / 2) - (i * width / 2);
				int y = (j * height / 2) + (i * height / 2);
				
				tile.render(g, x, y);
			}
		}
		
		// rendering rocks and so on..
		this.nature.render(g);
	}


	public void checkHover(int x, int y) {
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public void updateInterval(int x, int y) {
		this.translate.update(x, y);
	}
}
