package July;

public class BJ {

	public static void main(String[] args) 
	{
		wholeseller ws = new wholeseller("Rabindra", "Silver");
		
		wholeseller.Membership mw = ws.new Membership();
		mw.setMembership();
		System.out.println("Member type\t"+ ws.MemberType + mw.getMembership());
		System.out.println("***********Next customer*************");
		wholeseller ws1 = new wholeseller("Jenisha", "Gold");
		wholeseller.Membership mw1 = ws1.new Membership();
		mw1.setMembership();
		System.out.println("Member type\t" +ws1.MemberType + mw1.getMembership());
		System.out.println("***********Next customer*************");
		wholeseller ws2 = new wholeseller("Rohan Amatya", "Gold");
		wholeseller.Membership mw2 = ws2.new Membership();
		mw2.setMembership();
		System.out.println("Member type\t" +ws2.MemberType+ mw2.getMembership());
	}

}
class  wholeseller
{
	String CustName, MemberType;
	private String MemberName()
	{
		return this.CustName;
	}
	
	public wholeseller(String cn, String Mt)
	{
		this.CustName =cn;
		this.MemberType = Mt;
	}
	
	class Membership
	{
		String MemberType;
		
		void setMembership()
		{
			if(wholeseller.this.MemberType.equals("Silver")) 
			{
				if(wholeseller.this.MemberName().equals("Rabindra")) 
				{
					this.MemberType = "you are 10 years loyal customer";
				}
				else 
				{
				this.MemberType ="10% discount on first purchases";
				}
			}
			else if(wholeseller.this.MemberType.equals("Gold"))
			{
				if(wholeseller.this.MemberName().equals("Jenisha"))
				{
					this.MemberType = "\tyou receive 20% for loyal customer";
				}
				else 
				{
				this.MemberType = "\t12.5% discount on all purchases";
				}
			}
			else
			{
				this.MemberType = "2.5% discount on all purchases";
			}
		}
		String getMembership()
		{
			return this.MemberType;
		}
	}
}