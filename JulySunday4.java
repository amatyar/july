package July;

public class JulySunday4 
{

	public static void main(String[] args) 
	{
		Union_C uc = new Union_C();
		uc.account();
		uc.deposite();
		uc.loan();
		uc.withdraw();

	}

}
interface CreditUnion
{
	void deposite();
	void withdraw();
	void loan();
	void account();
}
abstract class Union_A implements CreditUnion
{
	public void deposite()
	{
		System.out.println("you deposite: $"+2500);
	}
}
abstract class Union_B extends Union_A
{
	public void loan()
	{
		System.out.println("you deposite: $"+250000);
	}
}
class Union_C extends Union_B{

	@Override
	public void withdraw() {
		System.out.println("you can withdraw:"+ 2500);
		
	}

	@Override
	public void account() {
		System.out.println( "you can active extra account");
	}

	
	
}