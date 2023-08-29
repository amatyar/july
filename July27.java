package July;

import java.util.ArrayList;

public class July27 
{

	public static void main(String[] args)
	{
		ArrayList<String> Cities = new ArrayList<>();
		Cities.add("Boston");
		Cities.add("Quincy");
		Cities.add("Braintree");
		Cities.add("Alstone");
		
		String q= Cities.get(0);
		System.out.println(q);
		// Retrieve
		for(int i = 0; i < Cities.size(); i++)
		{
			//System.out.println(i);
			System.out.println(Cities.get(i));
		}
		
		
		ArrayList<String> States = new ArrayList<>();
		
		// Adding 
		States.add("Massachussett");
		States.add("Connecicutte");
		States.add("Texa");
		States.add("New York");
		System.out.println(States);
		// Update
		States.set(0, "New Hampshire");
		System.out.println(States);
		// remove
		States.remove(2);
		
		System.out.println(States);
	}

}
