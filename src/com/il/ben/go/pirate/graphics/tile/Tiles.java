package com.il.ben.go.pirate.graphics.tile;

public enum Tiles {
	BATTLE_BLOCK("battle_block", 45, 45, "water2.png"),
	ROCK("rock", 45, 45, "rock.png"),
	HOVER("water_hover", 4, 4, "waterhover.png"),
	WF("base3", 0,0, "wf.png");
	
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
