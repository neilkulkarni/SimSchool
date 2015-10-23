package LivingBeings;

public abstract class Organism implements Drawable
{
	private int xPos;
	private int yPos;
	
	public Organism()
	{
		
	}
	
	public Organism (int xPos, int yPos)
	{
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	
	public String toString()
	{
		return "This living being is an organism.";
	}
}
