package July;

public class July12c 
{
// abstract class  with 2 sub classes
	public static void main(String[] args) 
	{
	Spring sp= new Spring();
	sp.boil();
	sp.cold();
	sp.measureTemp();
	sp.springDisplay();
	
	System.out.println("---------- Next case----------");
	Poland pl = new Poland();
	pl.boil();
	pl.cold();
	pl.measureTemp();
	pl.polandDisplay();
	

	}

}
abstract class water{
	abstract void boil();
	abstract void cold();
	public void measureTemp() 
	{
		System.out.println("Get me therometer.");
	}
}
class Spring extends water{

	@Override
	public void boil() {
		System.out.println("This is hot water handle with care.");
		
	}

	@Override
	void cold() {
		System.out.println(" you can carry easy.");
		
	}
	public void springDisplay() {
		System.out.println(" we are higher priced in the market.");
	}
	
}
class Poland extends water{

	@Override
	void boil() {
		System.out.println(" please order before you pick up");
		
	}

	@Override
	void cold() {
		System.out.println(" we bit market price.");
		
	}
	public void polandDisplay() {
		System.out.println("we are popular.");
	}
}