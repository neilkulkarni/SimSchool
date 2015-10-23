package Animals;

public class NamedCow extends Cow
{
	private String name;
	
	NamedCow(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	 public String toString() {
			return "The " + getType() + "named " + getName() + " goes " + getSound();
		  }
}
