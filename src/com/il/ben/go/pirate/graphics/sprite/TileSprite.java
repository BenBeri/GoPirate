package com.il.ben.go.pirate.graphics.sprite;

import org.newdawn.slick.Image;

import com.il.ben.go.pirate.graphics.tile.Tiles;

public class TileSprite {

	private Tiles tile;
	private Sprite sprite;
	
	public TileSprite(Tiles tile) {
		this.tile = tile;
		this.sprite = new Sprite(tile.getPath());
	}
	
	public Image getImage() {
		return this.sprite.getSprite();
	}

	public Sprite getSprite() {
		return this.sprite;
	}
}
