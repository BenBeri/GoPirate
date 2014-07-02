package com.il.ben.go.pirate;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import com.il.ben.go.pirate.controllers.ControllerContainer;
import com.il.ben.go.pirate.graphics.GraphicContainer;
import com.il.ben.go.pirate.graphics.GraphicContainer.LayerNotFoundException;




public class GoPirate implements Game {

	private GraphicContainer gContainer;
	private ControllerContainer container;
	
	@Override
	public boolean closeRequested() {
		return false;
	}

	@Override
	public String getTitle() {
		return null;
	}

	@Override
	public void init(GameContainer c) throws SlickException {
		if (c instanceof AppGameContainer) {
			AppGameContainer c1 = (AppGameContainer) c;
			c1.setTitle("Go pirate");
			
			this.gContainer = new GraphicContainer();
			
			try {
				this.container = new ControllerContainer(c.getInput(), this.gContainer);
			} catch (LayerNotFoundException e) {
				e.printStackTrace();
			}
		}		
	}

	@Override
	public void render(GameContainer c, Graphics g) throws SlickException {
		this.gContainer.render(g);
	}

	@Override
	public void update(GameContainer c, int delta) throws SlickException {
		this.gContainer.update();
	}
	
	/**
	 * @param args
	 * @throws SlickException 
	 */
	public static void main(String[] args) throws SlickException {
		AppGameContainer go = new AppGameContainer(new GoPirate());
		go.setDisplayMode(765, 565, false);
		go.setAlwaysRender(true);
		go.setMaximumLogicUpdateInterval(60);
		go.setTargetFrameRate(200);
		go.setVSync(true);
		go.setShowFPS(false);
		go.start();
	}

}
