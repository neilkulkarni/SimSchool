package People;
import java.awt.Color;

import LivingBeings.Organism;
import gpdraw.DrawingTool;
import shapes.*;

/**
 * L.A.11.1
 *
 * The root of the Person hierarchy.  All persons have
 * a name and an age and a gender
 */

public class Person extends Organism
{
  private String myName ;   // name of the person
  private int myAge;        // person's age
  private String myGender;    // 'M' for male, 'F' for female
  private Color race;

  // constructor  
  public Person(String name, int age, String gender)
  {
	myName = name;
    myAge = age;
    myGender = gender;
    race = Color.BLACK;
  }

  public String getName()
  {
    return myName;
  }

  public int getAge()
  {
    return myAge;
  }

  public String getGender()
  {
    return myGender;
  }

  public void setName(String name)
  {
    myName = name;
  }

  public void setAge(int age)
  {
    myAge = age;
  }

  public void setGender(String gender)
  {
    myGender = gender;
  }
  
  public void draw(DrawingTool marker, int xPos, int yPos)
  {   
	  Circle head = new Circle(0 + xPos, 100 + yPos, 0, race, 50);
	  head.draw(marker);
	  
	  Line body = new Line (0.0 + xPos, 50.0 + yPos, 0.0 + xPos, -25.0 + yPos, 0, race);
	  body.draw(marker);
	  
	  Line arm = new Line (-50.0 + xPos, 25.0 + yPos, 50.0 + xPos, 25.0 + yPos, 0, race);
	  arm.draw(marker);
	  
	  Line legL = new Line (0 + xPos, -25 + yPos, 225.0, 50.0, 0, race);
	  Line legR = new Line (0 + xPos, -25 + yPos, 315.0, 50.0, 0, race);
	  legL.draw(marker);
	  legR.draw(marker);
  }

  public String toString()
  {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }
}