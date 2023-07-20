package July;

public class july5a {

	public static void main(String[] args) 
	{
		CarB cb = new CarB("Sentra","Nissan", 2004);
		System.out.println(cb.Name +","+cb.model+","+cb.years);
		System.out.println("********************");
		cb.CarNameModel();
		cb.CarNameModelYear();
		System.out.println("********************");
		CarC cc= new CarC("Takoma", "Nissan", 4);
		System.out.println(cc.Name +","+ cc.model+","+ cc.doors);
		System.out.println("********************");
		
		cc.CarNameDoor();
		cc.CarNameModel();
	}

}
class CarA {
	String model;
	String Name;
	
	public CarA(String md, String nm) {
		this.model = md;
		this.Name = nm;
	}
	public void CarNameModel()
	{
		System.out.println(this.Name + this.model);
	}
}
class  CarB extends CarA{
  int years;
	public CarB(String md, String nm, int yr) {
		super(md, nm);
		this.years = yr;
	}
	public void CarNameModelYear()
	{
		System.out.println(this.Name+this.model+this.years);
	}
}
class CarC extends CarA
{
 int doors;
	public CarC(String md, String nm, int dr) {
		super(md, nm);
		this.doors= dr;
		
	}
	public void CarNameDoor() {
		System.out.println(this.Name + this.doors);
	}
}