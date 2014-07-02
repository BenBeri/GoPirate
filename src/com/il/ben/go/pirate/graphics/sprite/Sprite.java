package com.il.ben.go.pirate.graphics.sprite;


import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.il.ben.go.pirate.GoConfig;

public class Sprite {
	
	private String path;
	private Image spriteImage;
	
	public Sprite(String spritePath) {
		this.path = GoConfig.SPRITE_PATH + spritePath;
		try {
			this.spriteImage = new Image(this.path);
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}
	
	public int getWidth() {
		return this.spriteImage.getWidth();
	}
	
	public int getHeight() {
		return this.spriteImage.getHeight();
	}
	
	public Image getSprite() {
		return this.spriteImage;
	}
}
