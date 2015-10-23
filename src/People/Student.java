package People;
import gpdraw.DrawingTool;

import java.awt.Color;
import shapes.*;

/**
 * L.A.11.1
 *
 * A student, is a Person with an id number and
 * a grade point average
 */

public class Student extends Person
{
  private String myIdNum;    // Student Id Number
  private double myGPA;      // grade point average
  private Color race;

  // constructor
  public Student(String name, int age, String gender,
                 String idNum, double gpa)
  {
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
    race = Color.BLACK;
  }

  public String getIdNum()
  {
    return myIdNum;
  }

  public double getGPA()
  {
    return myGPA;
  }

  public void setIdNum(String idNum)
  {
    myIdNum = idNum;
  }

  public void setGPA(double gpa)
  {
    myGPA = gpa;
  }
  
  public void draw(DrawingTool marker, int xPos, int yPos)
  {
	  super.draw(marker, xPos, yPos);
	  
	  Rectangle backpack = new Rectangle (0 + xPos, 15 + yPos, 0, race, 50, 60);
	  backpack.draw(marker);
	  
	  Line backpackStrapL = new Line (-10.0 + xPos, 35.0 + yPos, -15.0 + xPos, 5.0 + yPos, 0, race);
	  Line backpackStrapR = new Line ( 10.0 + xPos, 35.0 + yPos,  15.0 + xPos, 5.0 + yPos, 0, race);
	  backpackStrapL.draw(marker);
	  backpackStrapR.draw(marker);  
  }

  public String toString()
  {
    return super.toString() +
           ", student id: " + myIdNum + ", gpa: " + myGPA;
  }
}
