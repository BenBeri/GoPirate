package com.il.ben.go.pirate.graphics.impl.battle;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import com.il.ben.go.pirate.graphics.Layer;
import com.il.ben.go.pirate.graphics.tile.Tile;
import com.il.ben.go.pirate.graphics.tile.Tiles;

public class Nature implements Layer {

	private Tile[][] tiles = new Tile[15][10];
	
	public Nature() {
		tiles[5][5] = new Tile(0, -(112), Tiles.ROCK);
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
				
				int width = tile.getWidth();
				int height = tile.getHeight();
				int x = (j * width / 2) - (i * width / 2);
				int y = (j * height / 2) + (i * height / 2);
				
				System.out.println(y);
				tile.render(g, x, y);
			}			
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


}
