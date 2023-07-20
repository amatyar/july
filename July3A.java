package July;

public class July3A 
{

	public static void main(String[] args) 
	{
		
		Animal2 Lamb = new Animal2("Dodu", "Brown", 2);
		System.out.println(Lamb.Name +" , " + Lamb.Color +" , " +Lamb.Age);
		Lamb.NameColor();
		System.out.println("************ Next case*********");
		goat gt = new goat("Duku", "Black / white", 4, 3);
		System.out.println(gt.Name +","+gt.Color+"," + gt.Age+"," + gt.food);

		gt.NameFood();
	}

}
class Animal2
{
	String Name ;
	String Color ;
	int Age ;
	
	public Animal2(String Nm, String cl, int ag) 
	{
		this.Name  = Nm;
		this.Color = cl;
		this.Age   = ag;
	}
	
	public void NameColor() 
	{
		System.out.println(this.Name +"/"+ this.Color);
	}
}

class goat extends Animal2
{
	int food;
	
	public goat(String Nm, String cl, int ag, int fo) 
	{
		super(Nm, cl, ag);
		this.food = fo;
	}
	public void NameFood()
	{
		System.out.println("Goat eat weight"+ this.Name +" / " + this.food);
	}
	
}
