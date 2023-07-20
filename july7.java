package July;
import java.util.Arrays;

public class july7 
{
	// private,  super
	public static void main(String[] args) 
	{
		BCD  cd = new BCD(255, "Java the world","Programming");
		
		
		
		System.out.println(cd.subject);
		cd.DisplayNS();
		cd.DisplayNn();
		
		
	}
}
class ABCD
{
	private int number;
	private String Name;
	
	public ABCD(int num, String nm)
	{
		this.Name   = nm;
		this.number = num;	
		
	}
	public void DisplayNn() {
		System.out.println(this.Name +" ," + this.number);
	}
}

class BCD extends ABCD
{
	String subject;

	public BCD(int num, String nm, String sb) 
	{
		
		super(num, nm);
		this.subject = sb;
		
	}
	public void DisplayNS()
	{
		System.out.println(this.subject);
		super.DisplayNn();
	}
}