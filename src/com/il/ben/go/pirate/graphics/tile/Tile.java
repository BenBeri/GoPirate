package com.il.ben.go.pirate.graphics.tile;

import org.newdawn.slick.Graphics;

import com.il.ben.go.pirate.graphics.sprite.TileSprite;

public class Tile {

	private int offX;
	private int offY;
	
	private int x;
	private int y;
	
	public TileSprite sprite;
	
	public Tile(int x, int y, Tiles tile) {
		this(x, y, 0, 0, tile);
	}
	
	public Tile(int x, int y, int offX, int offY, Tiles tile) {
		this.x = x;
		this.y = y;
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
	
	public void render(Graphics g) {
		
		int x = (this.x * this.getWidth() / 2) - (this.y * this.getWidth() / 2);
		int y = (this.x * (this.getHeight() + offY) / 2) + (this.y * (this.getHeight() + offY) / 2);
		
		g.drawImage(this.sprite.getImage(), x, y);
	}
}
