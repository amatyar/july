package July;
// New pull for practice
// today is  july 17 2023
// Monday
public class July03 
{
	public static void main(String[] args) 
	{
		Animal1 Dog = new Animal1();
		
		System.out.println(Dog.Name + Dog.Color + Dog.Age);
		Dog.AnimalName();
		Dog.AnimalColorAge();
		System.out.println("***********Next Case********");
		cat ct = new cat();
		System.out.println(ct.Name+" " + ct.Color +" "+ ct.Age  +" "+ ct.food);
		ct.AnimalColorAge();
		ct.CatFood();

	}
}
class Animal1
{
	String Name = "Tau";
	String Color = "Brown";
	int Age = 3;
	
	public void AnimalName() 
	{
		System.out.println(this.Name );
	}
	public void AnimalColorAge() 
	{
		System.out.println(this.Color + this.Age );
	}
}

class cat extends Animal1 
{	
	
	String food = "meat";
	
	public void CatFood()
	{
		System.out.println(this.food);
	}
}
