package People;
import java.awt.Color;

import shapes.Line;
import shapes.Rectangle;
import gpdraw.DrawingTool;


public class CollegeStudent extends Student
{
	private String myMajor;
	private int myYear;
	private Color race;
	
	
	public CollegeStudent (String name, int age, String gender, String idNum, double gpa, int year, String major)
	{
		super (name, age, gender, idNum, gpa);
		
		myYear = year;
		myMajor = major;
		race = Color.BLACK;
	}
	
	
	public int getYear()
	{
		return myYear;
	}
	
	public String getMajor()
	{
		return myMajor;
	}
	
	public void setYear(int year)
	{
		myYear = year;
	}
	
	public void setMajor(String major)
	{
		myMajor = major;
	}
	
	public void draw(DrawingTool marker, int xPos, int yPos)
	{
		super.draw(marker, xPos, yPos);
		
		Line glassesBridge = new Line (-5 + xPos, 110 + yPos, 0.0, 10.0, 0, race);
		glassesBridge.draw(marker);
		
		Rectangle glassesL = new Rectangle (-15 + xPos, 110 + yPos, 0, race, 25, 20);
		Rectangle glassesR = new Rectangle ( 15 + xPos, 110 + yPos, 0, race, 25, 20);
		glassesL.draw(marker);
		glassesR.draw(marker);
		
		Rectangle iPhone = new Rectangle (50 + xPos, 25 + yPos, 0, race, 18, 32);
		iPhone.draw(marker);
	}
	
	public String toString()
	{
		return super.toString() + ", year: " + myYear + ", major: " + myMajor;
	}
}
