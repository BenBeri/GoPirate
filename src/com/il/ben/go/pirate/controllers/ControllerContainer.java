package com.il.ben.go.pirate.controllers;

import org.newdawn.slick.Input;

import com.il.ben.go.pirate.graphics.GraphicContainer;
import com.il.ben.go.pirate.graphics.GraphicContainer.LayerNotFoundException;
import com.il.ben.go.pirate.graphics.Layers;

public class ControllerContainer {

	private BattleBoard board;
	private GraphicContainer container;
	
	private Input gameInput;
	
	public ControllerContainer(Input i, GraphicContainer container) throws LayerNotFoundException {
		this.gameInput = i;
		this.container = container;
		
		this.board = new BattleBoard(this.gameInput, container.getLayer(Layers.BATTLE_BOARD));
		this.board.init();
	}

}
