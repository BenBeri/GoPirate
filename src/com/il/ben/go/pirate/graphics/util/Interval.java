package com.il.ben.go.pirate.graphics.util;

public class Interval {

	private int x;
	private int y;
	
	public Interval() {
		this(0, 0);
	}
	
	public Interval(int x, int y) {
		this.set(x, y);
	}

	public void updateX(int x) {
		this.x = x;
	}
	
	public void updateY(int y) {
		this.y = y;
	}
	
	public void update(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
