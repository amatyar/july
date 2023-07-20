package July;

public class July16 
{

	public static void main(String[] args)
	{
		 DemoClass obj = new DemoClass();  //create DemoClass object and call methods
	        obj.print();  
	        obj.show();
	}

}
interface Interface_One
	{  
	    void print();  
	}  
interface Interface_Two extends Interface_One
	{  
	    void show();  
	} 
class DemoClass implements Interface_Two
{  
    public void print()
    {        //Override Interface_Two print()
        System.out.println("Democlass");
    }

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}