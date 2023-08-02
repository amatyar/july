package July;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class July31a 
{
	public static void main(String[] args) 
	{
		ArrayList<String> birds = new ArrayList<>();
		birds.add("Parrot");
		birds.add("Owl");
		birds.add("Sparrow");
		birds.add("Pigeon");
		System.out.println(birds);
		
		String Input = "Owl";
		if (birds.contains(Input))
		{
			System.out.println("Availabe bird.");
		}
		else
		{

			System.out.println("Unavailabe bird.");
		}
		
		// test for IndexOf
		
		if(birds.indexOf(Input) >= 0) 
		{
			
			System.out.println("Availabe bird.");
		}
		else
		{

			System.out.println("Unavailabe bird.");
		}

		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Java", "Python", "C#", "C++","Noge.js"));
		System.out.println("ArrayList" + lang);
		
		List<String> Language = new ArrayList<>();
		Language.add(Input);
		System.out.println(Language);
		
		
	}

}
