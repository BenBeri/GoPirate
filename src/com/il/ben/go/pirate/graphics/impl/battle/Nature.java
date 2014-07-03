package com.il.ben.go.pirate.graphics.impl.battle;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import com.il.ben.go.pirate.graphics.Layer;
import com.il.ben.go.pirate.graphics.tile.Tile;
import com.il.ben.go.pirate.graphics.tile.Tiles;

public class Nature implements Layer {

	private Tile[][] tiles = new Tile[15][10];
	
	public Nature() {
		tiles[1][0] = new Tile(1, 0, 0, 0, Tiles.ROCK);
//		tiles[0][0] = new Tile(0, -22, Tiles.ROCK);
//		tiles[0][1] = new Tile(0, -22, Tiles.ROCK);
	}
	
	@Override
	public void render(Graphics g) {
		for (int i = 0; i < this.tiles[0].length; i++){
			for (int j = 0; j < this.tiles[1].length; j++){
				Tile tile = this.tiles[i][j];
				
				if (tile == null)
					continue;
				
				tile.render(g);
			}			
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


}
