package com.il.ben.go.pirate.graphics.impl.battle;

import org.newdawn.slick.Graphics;

import com.il.ben.go.pirate.graphics.Layer;
import com.il.ben.go.pirate.graphics.tile.Tile;
import com.il.ben.go.pirate.graphics.tile.Tiles;

public class Entity implements Layer {

	private Tile[][] tiles = new Tile[15][10];
	private long moveTime;
	private boolean move;
	private int moved;
	public Entity() {
		tiles[5][5] = new Tile(5, 5, 0, 18, Tiles.WF);
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

	private int moveX;
	private int moveY;
	private boolean turned;
	private long turnY;
	private long turnX;
		
	@Override
	public void update() {
		if (move) {
			// Update animation every 17ms
			if (System.currentTimeMillis() - this.moveTime >= 17) {
				
				// adding relative offsets
				tiles[5][5].relativeX += moveX;
				tiles[5][5].relativeY += moveY;
				
				// adding moved token
				moved++;
				
				// timer to move Y coordinate
				if (System.currentTimeMillis() - turnY > 50){
					moveY++;
					turnY = System.currentTimeMillis();
				}
				
				// timer to move X coordinate
				if (System.currentTimeMillis() - turnX > 125){
					moveX++;
					turnX = System.currentTimeMillis();
				}
				
				// If moved more than 29 px, cancel animation and locate
				// to the right spot.
				if (moved >= 29) {
					
					// stops move
					move = false;
					
					// sets location
					tiles[5][5].updateX(1);
					tiles[5][5].updateY(1);
					
					// clears relatives offets
					tiles[5][5].relativeX = 0;
					tiles[5][5].relativeY = 0;
				}
				
				// upadates time
				this.moveTime = System.currentTimeMillis();
			}
		}
//		
//		tiles[5][5].relativeX += 2;
//		tiles[5][5].relativeY += 1;
//		moved++;
//		
//		if (moved >= 29) {
//			move = false;
//			this.moved = 0;
//			tiles[5][5].updateX(1);
//			tiles[5][5].relativeX = 0;
//			tiles[5][5].relativeY = 0;
//			
//		}
	}

	public void updateShip() {
		this.move = true;
		this.moveX = 2;
		this.moveY = 1;
	}
}
