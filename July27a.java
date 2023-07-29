package July;

import java.util.ArrayList;

public class July27a 
{

	public static void main(String[] args) 
	{
		Optum op = new Optum("Rabindra", "Braintree");
		Optum op1 = new Optum("Lav", "Malden");
		Optum op2 = new Optum("Krishna",  "Boston");
		Optum op3 = new Optum("Prem",  "Rode Island");
		Optum op4 = new Optum("Raghu",  "Quincy");
		
		ArrayList<Optum> Crews = new ArrayList<>();
		Crews.add(op);
		Crews.add(op1);
		Crews.add(op2);
		Crews.add(op3);
		Crews.add(op4);
		
		Crews.get(3).Display();
		
		// foreach
		for(Optum o: Crews)
		{
			System.out.println(o.Name +"\t"+ o.Address);
		}
		System.out.println("-------------next -----");
		//While loop
		
		int a = 0;
		while(a<Crews.size())
		{
			System.out.println(Crews.get(a).Name + ", " + Crews.get(a).Address);
			Crews.get(a).Display();
			a++;
		}
		System.out.println("-------------next -----");
		// for loop
		for ( int i = 0; i < Crews.size(); i++)
		{
			System.out.println(Crews.get(i).Name + ", "+ Crews.get(i).Address);
			Crews.get(i).Display();
		}

	}

}
class Optum{
	String Name;
	
	String Address;
	public Optum(String nm, String ad) 
	{
		this.Name = nm;
		
		this.Address = ad;
	}
	
	public void Display()
	{
		System.out.println("Name : "+this.Name + " Address : "+this.Address);
	}
}