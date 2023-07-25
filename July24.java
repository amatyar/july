package July;
enum Color{
	green, Red, Black,Brown;
	
	public String getColor() 
	{
		switch(this)
		{
		case green:
			return "you choose green";
		case Red:
			return "You choose Red";
		case Black:
			return "you choose Black";
		case Brown:
			return "You choose Brown";
			default:
				return null;
		}
	}
}

public class July24 
{
	public static void main(String[] args) 
	{
		String cl = Color.Brown.getColor();
		System.out.println(cl);
	}
}
