package July;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class August01a {

	public static void main(String[] args) {
		HashMap<String ,Integer> People = new HashMap<>();
		
		//adding data
		
		People.put("Ram", 25);
		People.put("Rammy", 65);
		People.put("Kiran", 39);
		People.put("Hari", 45);
		People.put("Prem", 29);
		
		//print out
		System.out.println(People);
		
		// looping through HashMap
		
		System.out.println(People.values());
		System.out.println(People.keySet());
		
		// looping over 
		
		for (Map.Entry<String, Integer> abc: People.entrySet())
		{
			String string = abc.getKey();
			Integer integer = abc.getValue();
			System.out.println("Name :" + string + ", Age: " + integer);
		}
		System.out.println("****Next case*********");
		
		// using while loop
		
		Iterator it = People.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry me= (Map.Entry) it.next();
			System.out.println("Name :"+me.getKey()+" Age:"+me.getValue());
		}
		
	}

}
