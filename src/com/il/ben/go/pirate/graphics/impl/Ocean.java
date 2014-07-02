package com.il.ben.go.pirate.graphics.impl;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import com.il.ben.go.pirate.graphics.Layer;
import com.il.ben.go.pirate.graphics.sprite.TileSprite;
import com.il.ben.go.pirate.graphics.tile.Tiles;

public class Ocean implements Layer {

	private int[][] tiles = new int[20][20];
	
	private Image sprite;
	
	public Ocean() {
		this.sprite = new TileSprite(Tiles.BATTLE_BLOCK).getImage();
	}
	
	public void render(Graphics g) {
		for (int i = 0; i < 20*40; i += 62) {
			for (int j = 0; j <20*40; j += 50) {
				//g.drawImage(this.sprite, i, j);
			}
		}		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
