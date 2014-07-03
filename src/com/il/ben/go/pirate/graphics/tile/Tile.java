package com.il.ben.go.pirate.graphics.tile;

import org.newdawn.slick.Graphics;

import com.il.ben.go.pirate.graphics.sprite.TileSprite;

public class Tile {

	private int offX;
	private int offY;
	
	public TileSprite sprite;
	
	public Tile(Tiles tile) {
		this(0, 0, tile);
	}
	
	public Tile(int offX, int offY, Tiles tile) {
		this.offX = offX;
		this.offY = offY;
		this.sprite = new TileSprite(tile);
	}
	
	public int getOffX() {
		return this.offX;
	}
	
	public int getOffY() {
		return this.offY;
	}
	
	public TileSprite getSprite() {
		return this.sprite;
	}
	
	public int getWidth() {
		return this.sprite.getSprite().getWidth();
	}
	
	public int getHeight() {
		return this.sprite.getSprite().getHeight();
	}
	
	public void render(Graphics g, int x, int y) {
		x += this.offX;
		y += this.offY;
		
		g.drawImage(this.sprite.getImage(), x, y);
	}
}
