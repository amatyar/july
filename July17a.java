package July;

public class July17a 
{
	public static void main(String[] args) 
	{

		 NplBnk Nepal = new NplBnk("Nepal", "Kathmandu");
		  System.out.println(Nepal.City);
		  System.out.println(Nepal.Country);
		  
		  Nepal.Loan();
		  Nepal.Save();
		  Nepal.Message();

	}
}
abstract class WrldBnk
{
	 String Country;
	 
	 public WrldBnk(String CN)
	 {
	  this.Country = CN;
	  
	 }
	 
	 abstract void Save();
	 
	 public void Loan() 
	 {
	  System.out.println("The loan rate of WrldBank is 5%");
	 }
	 
	 public void Message() 
	 {
	  System.out.println("Welcome to our bank");
	 }
}

class NplBnk extends WrldBnk
{
	 String City;
	 public NplBnk(String CN, String CT) 
	 {
	  super(CN);
	  this.City = CT;
	 }
	 
	 public void Save() 
	 {
	  System.out.println("The save percentage is 20%");
	 }
	 
	 public void Loan() 
	 {
	  System.out.println("The loan percentage for NplBnk is 3%");
	 }
	 
	 
}