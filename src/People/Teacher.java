package People;
import java.awt.Color;

import shapes.*;
import gpdraw.DrawingTool;


public class Teacher extends Person
{
	private String mySubject;
	private double mySalary;
	private Color race;
	
	
	public Teacher (String name, int age, String gender, String subject, double salary)
	{
		super (name, age, gender);
		
		mySubject = subject;
		mySalary = salary;
		race = Color.BLACK;
	}
	
	
	public String getSubject()
	{
		return mySubject;
	}
	
	public double getSalary()
	{
		return mySalary;
	}
	
	public void setSubject(String subject)
	{
		mySubject = subject;
	}
	
	public void setSalary(double salary)
	{
		mySalary = salary;
	}
	
	public void draw(DrawingTool marker, int xPos, int yPos)
	{
		super.draw(marker, xPos, yPos);
		
		Line glassesBridge = new Line (-5 + xPos, 110 + yPos, 0.0, 10.0, 0, race);
		glassesBridge.draw(marker);
		
		Rectangle glassesL = new Rectangle (-15 + xPos, 110 + yPos, 0, race, 20, 10);
		Rectangle glassesR = new Rectangle ( 15 + xPos, 110 + yPos, 0, race, 20, 10);
		glassesL.draw(marker);
		glassesR.draw(marker);
	}
	
	public String toString()
	{
		return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
	}
}
