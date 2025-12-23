//Filip Milicevic
// This class defines the properties and behaviors of a game ball, managing the position, size, and movements speed. The methods render the ball as a red oval and updaes its coordinates to simulate motion and bouncing.

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

	//Precondition: g is a valid Graphics object and x, y, and size have valid values
	//Postcondition: A red filled oval of diameter size is drawn at position (x, y)
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
	//Precondition: x, y, XVelocity, and YVelocity are valid values
	//Postcondition: x is increased by XVelocity and y is increased by YVelocity
	public void move(){
	x += XVelocity;
	y += YVelocity;	
	}
}
