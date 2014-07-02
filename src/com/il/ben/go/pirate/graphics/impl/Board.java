package com.il.ben.go.pirate.graphics.impl;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import com.il.ben.go.pirate.graphics.IInterval;
import com.il.ben.go.pirate.graphics.Layer;
import com.il.ben.go.pirate.graphics.sprite.TileSprite;
import com.il.ben.go.pirate.graphics.tile.Tiles;
import com.il.ben.go.pirate.graphics.util.Interval;

public class Board implements Layer, IInterval {

	private int[][] tiles = new int[50][50];
	private Image sprite;
	
	private Interval translate = new Interval();
	
	public Board() {
		this.sprite = new TileSprite(Tiles.BATTLE_BLOCK).getImage();
	}
	
	public void render(Graphics g) {
		g.translate(this.translate.getX(), this.translate.getY());
		for (int i = 0; i < 40*50; i += 40) {
			for (int j = 0; j < 40*50; j += 40) {
				g.drawImage(this.sprite, i, j);
			}
		}
	}

	@Override
	public void update() {
		
	}

	@Override
	public void updateInterval(int x, int y) {
		this.translate.update(x, y);
	}
}
