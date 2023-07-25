package July;

public class JulySunday2 {

	public static void main(String[] args)
	{
		Account ac = new Account(256647456, "Rabindra Amatya", "amatyar@yahoo.com", "Boston, MA 02184", 300.25f);
		System.out.println("Account number: "+ ac.getAccountNo()+" Name: "+ac.getName()+" email: "+ac.getemail()+" address: "+ac.getaddress()+
				" amount :$"+ac.getamount());

	}

}
class Account
{
	private long AccountNo;
	private String name, email, address;
	private float amount;
	
	public Account(long Ac, String nm, String em, String ad, float am)
	{
		this.AccountNo = Ac;
		this.name = nm;
		this.email = em;
		this.address = ad;
		this.amount = am;		
	}
	public void setAccountNo(long Ac)
	{
		this.AccountNo= Ac;
	}
	public long getAccountNo()
	{
		return this.AccountNo;
	}
	public void setname(String nm)
	{
		this.name=nm;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setemail(String em)
	{
		this.email = em;
	}
	public String getemail() 
	{
		return this.email;
	}
	public void setaddress(String ad)
	{
		this.address = ad;
	}
	public String getaddress() 
	{
		return this.address;
	}
	public void setamount(float am)
	{
		this.amount = am;
	}
	public float getamount() 
	{
		return this.amount;
	}
}