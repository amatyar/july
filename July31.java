package July;
import java.util.ArrayList;
import java.util.Arrays;

public class July31
{
	public static void main(String[] args)
	{
		ArrayList<String> jobs = new ArrayList<>();
		// add ArrayList
		jobs.add("Carpenter");
		jobs.add("Manager");
		jobs.add("Cleaner");
		jobs.add("Banker");
		
		// use contain()
		boolean a = jobs.contains("Manager");
		System.out.println(a);
		
		// add index, String
		jobs.add(2, "Teacher");
		jobs.add(3, "Nurse");
		System.out.println(jobs);
		//update arraylist by index
		jobs.set(2, "Builders");
		System.out.println(jobs);
		//remove 
		jobs.remove(2);
		System.out.println(jobs);
		jobs.remove("Banker");
		System.out.println(jobs);
		
		// for clear arraylist		
		//jobs.clear();
		System.out.println(jobs);
		//using get()
		String JobIndex = jobs.get(3);
		System.out.println(JobIndex);;
		
		// find out Index of element
		
		int ab = jobs.indexOf("Banker");
		System.out.println(ab);
		int a1b = jobs.indexOf("Carpenter");
		System.out.println(a1b);
		
		//create new array of string type
		String[] arr = new String[jobs.size()]; 
		
		// convert arraylist to array
		jobs.toArray(arr);
		
		
		for (String ar : arr) {
			//System.out.println(" Array " + ar + ",");
		}System.out.println(Arrays.toString(arr));

	}

}

