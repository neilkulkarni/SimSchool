package Animals;

import java.awt.Color;

import gpdraw.*;
import shapes.*;
import LivingBeings.Drawable;
import LivingBeings.Organism;

public class Chick extends Organism implements Animal
{
	private String myType;
	private String mySound;
	private String myOtherSound;

	public Chick(){
		myType = "chick";
		mySound = "cheep";
		myOtherSound = "cluck";
	}

	public String getSound() 
	{
		int r = (int) (Math.random() * 2);
		if (r == 1)
		{
			return mySound;
		}
		else
		{
			return myOtherSound;
		}
	}

	public String getType() {
		return myType;
	}

	public String toString() {
		return "The " + getType() + " goes " + getSound();
	}

	
	public void draw (DrawingTool marker, int xPos, int yPos) 
	{
		Circle head = new Circle (0 + xPos, 0 + yPos, 0, Color.BLACK, 50);
		Circle eye = new Circle (25 + xPos, 25 + yPos, 0, Color.BLACK, 10);
		
		Line upperMouth = new Line (25.0 * Math.sqrt(3) + xPos, 25.0 + yPos, 75 + xPos, yPos, 0, Color.BLACK);
		Line lowerMouth = new Line (25.0 * Math.sqrt(3) + xPos,-25.0 + yPos, 75 + xPos, yPos, 0, Color.BLACK);
		
		head.draw(marker);
		eye.draw(marker);
		upperMouth.draw(marker);
		lowerMouth.draw(marker);
	}

}
