package com.BrickBreak;

import java.awt.Graphics;
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