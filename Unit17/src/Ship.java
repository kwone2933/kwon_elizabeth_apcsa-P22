//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   super(x,y); 
	   speed = 0; 
	}

	public Ship(int x, int y, int s)
	{
	   super(x,y); 
	   speed = s; 
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			//URL url = getClass().getResource("src/images/ship.jpg");
			image = ImageIO.read(new File("src/images/ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	  speed=s; 
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		switch(direction) {
		case "LEFT": 
			super.setX(super.getX()-speed);
			break;
		case "RIGHT": 
			super.setX(super.getX()+speed);
			break;
		case "UP" :
			super.setY(super.getY()-speed);
			break;
		case "DOWN" : 
			super.setY(super.getY() + speed);
			break; 
		}
		
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}