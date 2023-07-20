package July;

public class july12e
{
// abstract class with constructor
	public static void main(String[] args) 
	{
		Maintance mt= new Maintance(25, "Delux", 12.50, "Hector De Punte", 3);
		mt.displayHome();
		mt.displayMaintance();

	}

}
abstract class HomeDepot{
	int measure;
	String rugs;
	double Price;
	 
	public HomeDepot(int ms, String rg, double pr)
	{
		this.measure = ms;
		this.rugs = rg;
		this.Price = pr;
	}
	
	public void displayHome()
	{
		System.out.println(" We have all materials that you need in construction.");
	}
	
}
class Maintance extends HomeDepot{
 String name;
 int count;
	public Maintance(int ms, String rg, double pr, String nm, int ct) {
		super(ms, rg, pr);
		this.name= nm;
		this.count=ct;
	}
	public void displayMaintance() {
		System.out.println("Measure:\t"+this.measure + "\tPrice :\t"+ this.Price+"\tName of rug:\t"+this.rugs);
		System.out.println("Employee's Name:\t"+this.name + "\tHours: \t"+this.count);
	}
}