package com.il.ben.go.pirate.graphics.tile;

public enum Tiles {
	BATTLE_BLOCK("battle_block", 45, 45, "water2.png"),
	ROCK("rock", 45, 45, "rock.png"),
	HOVER("water_hover", 4, 4, "waterhover.png"),
	
	ROCK_BASE("base", 0,0, "rock/3.png"),
	ROCK_RIGHT("base1", 0,0, "rock/0.png"),
	ROCK_LEFT("base2", 0,0, "rock/1.png"),
	ROCK_TOP("base3", 0,0, "rock/2.png");
	
	private String name;
	private int width;
	private int height;
	private String path;
	
	Tiles(String name, int width, int height, String path) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.path = path;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPath() {
		return this.path;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
}
