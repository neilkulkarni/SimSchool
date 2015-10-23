package Animals;

import java.util.ArrayList;

public class Farm{
	private ArrayList<Animal> myFarm = new ArrayList<Animal>();

	public Farm(){
		myFarm.add(new Cow());
		myFarm.add(new Chick());
		myFarm.add(new Pig());
		myFarm.add(new NamedCow("Elsie"));
	}

	// This method prints out the result of each animal's toString() method to the command
	// line window.
	public void printAnimalSounds()
	{
		for (int i = 0; i < myFarm.size(); i++)  
		{
			System.out.println(myFarm.get(i));
		}
	}

	// This method prints out the lyrics to OldMacDonald, including all animals in the farm.
	public void printOldMacDonaldSong() 
	{
		for (int i = 0; i < myFarm.size(); i++)  
		{
			Animal a = myFarm.get(i);

			String song = "Old MacDonald had a farm, \n"
					+ "E-I-E-I-O. \n \n"
					+ "And on his farm he had some " + a.getType() + "s,\n"
					+ "E-I-E-I-O. \n \n"
					+ "With a " + a.getSound() + ", " + a.getSound() + " here, \n"
					+ "And a " + a.getSound() + ", " + a.getSound() + " there, \n"
					+ "Here a " + a.getSound() + ", there a " + a.getSound() + ", \n"
					+ "Everywhere a "  + a.getSound() + ", " + a.getSound() + " , \n \n"
					+ "Old MacDonald had a farm, \n"
					+ "E-I-E-I-O.\n";

			System.out.println(song);
		}
	}
}
