package July;

public class July16A 
{

	public static void main(String[] args) 
	{
		Vehicle vc = new Vehicle();

		vc.Gear(5);
		vc.Speed(65);
	}

}
interface Car
{
	public void Gear(int i);
	public void Speed (int j);
}
class Vehicle implements Car
{   private String dim = "km/hr";
	int speedup;
	int Gearup;
	@Override
	public void Gear(int i) 
	{
		this.Gearup = i;
		System.out.println("Which gear you are on:" + Gearup);
		
	}
	@Override
	public void Speed(int j) 
	{
		this.speedup = j;
		System.out.println("what's your speed:"+ speedup + dim);
		
	}
}