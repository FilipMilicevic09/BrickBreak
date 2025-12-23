//Filip Milicevic
//defined a plaer controlled paddle by managing its size/proportions, positions, and horizontal movement.
package com.BrickBreak;

import java.awt.*;

public class Paddle{


	//your code here!

	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int velocity;
	private int height;
	private int width;
	
	//constructor(s):
	public Paddle (int x,int y, int width, int height){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	//methods:
	//Precondition: g is a valid Graphics object and x, y, width, and height have valid values.
	//Postcondition: A white rectangle is drawn on the screen at position (x, y) with the given width and height.
	public void draw(Graphics g){
		g.setColor (Color.white);
		g.fillRect (x, y, width, height);
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getVelocity(){
		return velocity;
	}
	public void addVelocity (int velocity){
		this.velocity += velocity;
	}
	public void setVelocity (int velocity){
		this.velocity = velocity;
	}
	
	public void setX (int x){
		this.x = x;
	}
	//Precondition: x, velocity, and width are valid values, and width is greater than 0
	//Postcondition: x is updated by velocity and is kept within the bounds 0 to 695 - width
	public void move(){
		x += velocity;
	
	if (x < 0){
		x = 0;
	}
	if (x+ width > 695){
		x = 695 - width;
	}
}
}