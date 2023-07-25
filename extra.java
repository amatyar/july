package July;

public class extra
{ 
	public static void main(String[] args) 
	{
		
			Area Rectangle =new Area(10, 5);
			Rectangle.getArea();
	}
}
class Area
{
	int lenght, breadth ;
	//Constructor
	public Area(int l , int b)
	{
		this.lenght = l;
		this.breadth = b;
	}
	// method
	public void getArea()
	{
		 int area = this.lenght * this.breadth;
		 System.out.println("your Area  is : \t"+area);
	}
}