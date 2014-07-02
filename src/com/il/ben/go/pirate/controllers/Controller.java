package com.il.ben.go.pirate.controllers;

import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.MouseListener;

import com.il.ben.go.pirate.graphics.Layer;

public abstract class Controller<LayerType extends Layer> {

	private Input input;
	private LayerType layer;
	
	public Controller(Input input, LayerType layer) {
		this.input = input;
		this.layer = layer;
	}
	
	public LayerType getLayer() {
		return this.layer;
	}
	
	protected Input getInput() {
		return this.input;
	}
	
	protected void addMouseListener(MouseListener e) {
		this.input.addMouseListener(e);
	}
	
	protected void addKeyListener(KeyListener e) {
		this.input.addKeyListener(e);
	}
	
	public abstract void init();
}
