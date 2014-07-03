package com.il.ben.go.pirate.graphics;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Graphics;

import com.il.ben.go.pirate.graphics.impl.Ocean;
import com.il.ben.go.pirate.graphics.impl.battle.Board;

public class GraphicContainer {

	private Map<String, Layer> graphicLayers = new HashMap<String, Layer>();
	
	public GraphicContainer() {
		graphicLayers.put("battleBoard", new Board());
		graphicLayers.put("ocean", new Ocean());
	}
	
	public void update() {
		for (Layer layer : this.graphicLayers.values()) {
			layer.update();
		}
	}
	
	public void render(Graphics g) {
		for (Layer layer : this.graphicLayers.values()) {
			layer.render(g);
		}		
	}
	
	public Layer getLayer(Layers layer) throws LayerNotFoundException {
		String name = layer.getName();
		if (this.graphicLayers.containsKey(name)) {
			return this.graphicLayers.get(name);
		}
		throw new LayerNotFoundException("Layer was not found in the hash map");
	}
	
	public class LayerNotFoundException extends Exception {
		
		private static final long serialVersionUID = 1L;

		public LayerNotFoundException(String string) {
			super(string);
		}
	}

}
