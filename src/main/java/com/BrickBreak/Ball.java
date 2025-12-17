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
	private int XVelocity;
	private int YVelocity;
	
	// constructors
	Ball (int y, int x, int size){
	this.x = x;
	this.y = y;
	this.size = size;
	XVelocity = 1;
	YVelocity = 1;
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
	public int getSize(){
		return size;
	}
	public void reverseY(){
		YVelocity /= -1;
	}
	public void reverseX(){
        XVelocity /= -1;
    }
	public void setXVelocity(int XVelocity){
		this.XVelocity = XVelocity;
	}
	public void setYVelocity(int YVelocity){
		this.YVelocity = YVelocity;
	}
	public void setX (int x){
		this.x = x;
	}
	public void setY (int y){
		this.y = y;
	}
	public void move(){
	x += XVelocity;
	y += YVelocity;	
	}
}
