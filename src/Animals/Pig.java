package Animals;

import java.awt.Color;

import gpdraw.*;
import shapes.*;
import LivingBeings.Drawable;
import LivingBeings.Organism;

public class Pig extends Organism implements Animal
{
	  private String myType;
	  private String mySound;

	 public Pig(){
	    myType = "pig";
	    mySound = "oink";
	  }

	  public String getSound() {
	  	return mySound;
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
		  Circle rightEye = new Circle (15 + xPos, 25 + yPos, 0, Color.BLACK, 10);
		  Circle leftEye = new Circle (-15 + xPos, 25 + yPos, 0, Color.BLACK, 10);
		  
		  Circle nostrilLeft = new Circle (-5 + xPos, -5 + yPos, 0, Color.BLACK, 5);
		  Circle nostrilRight = new Circle (5 + xPos, -5 + yPos, 0, Color.BLACK, 5);
		  Circle mouth = new Circle (xPos, -5 + yPos, 0, Color.BLACK, 20);
		  
		  head.draw(marker);
		  rightEye.draw(marker);
		  leftEye.draw(marker);
		  nostrilLeft.draw(marker);
		  nostrilRight.draw(marker);
		  mouth.draw(marker);	
	}
}
