package com.il.ben.go.pirate.graphics.tile;

import org.newdawn.slick.Graphics;

import com.il.ben.go.pirate.graphics.sprite.TileSprite;

public class Tile {

	private static final int GRID_WIDTH = 112;
	private static final int GRID_HEIGHT = 56;
	
	private int offX;
	private int offY;
	
	public int relativeX;
	public int relativeY;
	
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
	
	public void updateX(int off) {
		this.x += off;
	}
	
	public void updateY(int off) {
		this.y += off;
	}
	
	public void render(Graphics g) {
		
	    int width = this.getWidth() - offX;
	    int height = this.getHeight() + offY;		
	    
	    int x = (this.x * GRID_WIDTH / 2) - (this.y * GRID_WIDTH / 2) - width / 2;
	    int y = (this.x * GRID_HEIGHT / 2) + (this.y * GRID_HEIGHT / 2) - height;
	    
	    x += relativeX;
	    y += relativeY;
	    
		g.drawImage(this.sprite.getImage(), x, y);
	}
}
