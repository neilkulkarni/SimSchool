package Animals;

import java.awt.Color;

import gpdraw.*;
import shapes.*;
import LivingBeings.Drawable;
import LivingBeings.Organism;

public class Cow extends Organism implements Animal
{
  private String myType;
  private String mySound;

  public Cow()
  {
    myType = "cow";
    mySound = "moo";
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
  
  public void draw(DrawingTool marker, int xPos, int yPos) 
  {
	  Circle head = new Circle (0 + xPos, 0 + yPos, 0, Color.BLACK, 50);
	  Circle rightEye = new Circle (15 + xPos, 15 + yPos, 0, Color.BLACK, 10);
	  Circle leftEye = new Circle (-15 + xPos, 15 + yPos, 0, Color.BLACK, 10);
	  Circle leftSpot = new Circle (-35 + xPos, yPos, 0, Color.BLACK, 5);
	  Circle rightSpot = new Circle (35 + xPos, yPos, 0, Color.BLACK, 5);
	  Circle randomSpot = new Circle (-25 + xPos, -30 + yPos, 0, Color.BLACK, 5);
	  
	  Circle nostrilLeft = new Circle (-5 + xPos, -15 + yPos, 0, Color.BLACK, 5);
	  Circle nostrilRight = new Circle (5 + xPos, -15 + yPos, 0, Color.BLACK, 5);
	  Rectangle mouth = new Rectangle (xPos, -15 + yPos, 0, Color.BLACK, 40, 20);
	  
	  head.draw(marker);
	  rightEye.draw(marker);
	  leftEye.draw(marker);
	  leftSpot.draw(marker);
	  rightSpot.draw(marker);
	  randomSpot.draw(marker);
	  nostrilLeft.draw(marker);
	  nostrilRight.draw(marker);
	  mouth.draw(marker);
  }
}
