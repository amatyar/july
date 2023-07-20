package July;

public class July12A 
{

	public static void main(String[] args) 
	{
		App a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  

	}

}
//Creating interface that has 4 methods  
interface App
{  
	//by default, public and abstract  
		public void a();
		void b();  
		public void c();  
		void d();  
}  

//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements App
{  
		public void c()
		{
			System.out.println("I am implements of A , am C");
		}  
}  

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B
{  
	public void a()
	{
		System.out.println("I am a");
	}  
	public void b()
	{
		System.out.println("I am b");
	}  
	public void d()
	{
		System.out.println("I am d");
	}  
}  