package July;

enum Color32{
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

public class Enum01 
{
	public static void main(String[] args) 
	{
		String cl = Color32.Brown.getColor();
		System.out.println(cl);
	}
}



