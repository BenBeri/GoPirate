package com.il.ben.go.pirate.graphics.tile;

public enum Tiles {
	BATTLE_BLOCK("battle_block", 40, 40, "water.png");
	
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
