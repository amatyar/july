package July;

public class July13 
{//inheritance , overloading , overriding
	public static void main(String[] args) 
	{
		HomeA ha = new HomeA(3, "South side home", 500.75);
		ha.display(3);
		ha.display(3, "South Side home");
		ha.display(3, "South side home", 1500.25);
		System.out.println("----------Next case----------");
		Apartment ap= new Apartment(3, "South side",300.25, 3);
		ap.display(5);		
		ap.display(2, "South Side", 3);
		ap.display(5, 300.25);

	}

}
class HomeA{
	
	int doors;
	String roomname;
	double rent;
	 
	public HomeA(int dr, String rn, double rt) 
	{
		this.doors  = dr;
		this.roomname = rn;
		this.rent = rt;		
	}
	// Overloading
	public void display(int dr)
	{
		System.out.println("your door:\t"+this.doors);
	}
	public void display(int dr, String rn)
	{
		System.out.println("your door:\t"+this.doors + "\tRoom Name:\t"+ this.roomname);
	}
	public void display(int dr, String  rn, double rt)
	{
		System.out.println("your door:\t"+this.doors + "\tRoom Name:\t"+ this.roomname + "Rents:\t"+ this.rent);
	}
	
}
// inheritance
class Apartment extends HomeA
{
	private int n = 5 ;
	int floors;
	public Apartment(int dr, String rn, double rt, int fl) {
		super(dr, rn, rt);
		this.floors = fl;
	}
	// overriding
	public void display(int dr)
	{
		System.out.println("Total door:\t"+ this.doors * n);
	}
	public void display(int dr, String rn, int fl)
	{
		System.out.println("total door:\t"+(this.doors * n) + "\tRoom Name and Floor\t"+ (this.roomname + ", "+this.floors));
	}
	public void display(int fl,  double rt)
	{
		System.out.println("your floor:\t"+this.floors + "\tRoom Rents\t"+ "Rents:\t"+ this.rent * n );
	}
	
}
