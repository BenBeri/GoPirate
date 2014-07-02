package com.il.ben.go.pirate.graphics;

public enum Layers {
	BATTLE_BOARD("battleBoard"),
	OCEAN("ocean");
	
	private String name;
	
	Layers(String n){
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
}
