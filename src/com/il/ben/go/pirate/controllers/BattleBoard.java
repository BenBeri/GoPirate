package com.il.ben.go.pirate.controllers;

import org.newdawn.slick.Input;

import com.il.ben.go.pirate.graphics.impl.Board;
import com.il.ben.go.pirate.input.BattleBoardMouseDrag;
import com.il.ben.go.pirate.graphics.IInterval;
import com.il.ben.go.pirate.graphics.Layer;

public class BattleBoard extends Controller<Board> {

	public BattleBoard(Input input, Layer board) {
		super(input, (Board) board);
	}

	@Override
	public void init() {
		super.addMouseListener(new BattleBoardMouseDrag(this));
	}

	public void updateScreenIntervals(int x, int y) {
		((IInterval) super.getLayer()).updateInterval(x, y);
	}


}
