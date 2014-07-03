package com.il.ben.go.pirate.input;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;

import com.il.ben.go.pirate.GoPirate;
import com.il.ben.go.pirate.controllers.BattleBoard;
import com.il.ben.go.pirate.controllers.Controller;

public class BattleBoardMouseDrag implements MouseListener {

	private Controller c;
	
	public BattleBoardMouseDrag(Controller c) {
		this.c = c;
	}
	
	@Override
	public void inputEnded() {
	}

	@Override
	public void inputStarted() {
	}

	@Override
	public boolean isAcceptingInput() {
		return true;
	}

	@Override
	public void setInput(Input arg0) {
	}

	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		System.out.println(arg0 + " " + arg1 + " " + arg2 + " " + arg3);
		
	}

	@Override
	public void mouseDragged(int oldX, int oldY, int newX, int newY) {
		int x = newX - oldX;
		int y = newY - oldY;
		
		((BattleBoard) this.c).updateScreenIntervals(x, y);
	}

	@Override
	public void mouseMoved(int oldX, int oldY, int newX, int newY) {
		((BattleBoard) this.c).updateHover(newX, newY);
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
