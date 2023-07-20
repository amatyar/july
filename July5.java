package July;

public class July5 
{
	public static void main(String[] args) 
	{
		puppy pu = new puppy ("judo","Brown", 5, "dog food");
		
		System.out.println(pu.name+","+pu.age+","+pu.Color+","+pu.food);
		pu.NameAge();
		pu.NameClor();
		pu.FoodPuppy();

	
	}

}
class Animal22{
	String name;
	String Color;
	
 public  Animal22(String nm, String cl)
	{
		this.name= nm;
		this.Color= cl;
	}
 public void NameClor() {
	 System.out.println(this.name + this.Color);
 }
}
class Dog extends Animal22{
	int age;
	public Dog(String nm, String cl, int ag) {
		super(nm, cl);
		this.age = ag;
		
	}
	
	public void NameAge()
	{
		System.out.println(this.name +" , "+ this.age);
	}
	
}
class puppy extends Dog
{
	String food;
	public puppy(String nm, String cl, int ag, String Fd) {
		super(nm, cl, ag);
		this.food = Fd;		
	}
	public void FoodPuppy()
	{
		System.out.println(this.food+" , " + this.name);
	}
	
}


