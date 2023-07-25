package July;

public class JulySunday 
{
	public static void main(String[] args) 
	{
		Premium abj;
		// abj initialize 
		abj = Premium.getObj();
		System.out.println(abj.string);
		abj.DisplayObj();
	}
}
class Premium
{
	//Private obj, so it can be access by getObj() method
	private static Premium Obj;
	public String string;
	// constructor for prevent to make object 
	private Premium()
	{
		string ="Welcome to Boston, we believe you will enjoy";
	}
	// method to return Obj of class
	public static Premium getObj()
	{
		if(Obj == null) {
			// if Obj is null then initialize
			Obj = new Premium();
		}
		return Obj;		
	}
	public void DisplayObj() 
	{
		System.out.println("Are you enjoying? Do you like Panjabi food? how about Biryani???");
	}
}