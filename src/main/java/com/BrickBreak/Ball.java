//Filip Milicevic
// a brief description

package com.BrickBreak;
import java.awt.*;


public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int xVelocity;
	private int yVelocity;
	
	// constructors
	Ball (int y, int x, int size){
	this.x = x;
	this.y = y;
	this.size = size;
	xVelocity = 1;
	yVelocity = 1;
	}
	//methods:
	public void draw(Graphics g){	
	g.setColor(Color.red);
	g.fillOval(x, y, size, size);
	}
	public int getXpos(){
		return  x;
	}
	public int getYpos(){
		return  y;
	}
	public in getSize(){
		return size;
	}
}
