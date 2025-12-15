//Your name
// a brief description

package com.BrickBreak;
import java.awt.*;


public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	
	Ball (int, int, int)
	//methods:
	public void draw(Graphics g){	
	g.setColor(Color.cyan);
	g.fillOval(x, y, size, size);
	}
}
