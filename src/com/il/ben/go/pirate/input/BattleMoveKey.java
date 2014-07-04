package com.il.ben.go.pirate.input;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.MouseListener;

import com.il.ben.go.pirate.GoPirate;
import com.il.ben.go.pirate.controllers.BattleBoard;
import com.il.ben.go.pirate.controllers.Controller;

public class BattleMoveKey implements KeyListener {

	private Controller c;
	
	public BattleMoveKey(Controller c) {
		this.c = c;
	}

	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAcceptingInput() {
		return true;
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(int arg0, char arg1) {
		((BattleBoard) this.c).updateShip();
	}

	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
