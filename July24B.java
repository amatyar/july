package July;

public class July24B {

	public static void main(String[] args) 
	{
		BK bk = new BK(Fries.medium);
		bk.pickup();

	}

}
enum Fries{ small, medium, large}
class BK
{
	Fries Ordertype;
	
	public BK(Fries Otype ) 
	{
		this.Ordertype = Otype;
	}
	
	public void pickup() 
	{
		switch(Ordertype)
		{
		case small:
			System.out.println(" small fries here.");
			break;
		case medium:
			System.out.println(" Medium fries here.");
			break;
		case large:
			System.out.println(" Large fries here.");
			break;
		}
	}
}