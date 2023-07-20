package July;

public class July7B 
{
	//protected , super
	public static void main(String[] args) 
	{
		BigBook BK= new BigBook("Dummy Java", 30, "Nail O'Corner");
		
		
		BK.DisplayBook();
		BK.DisplayBookIns();
		BK.DisplayPages();

	}
}
class Books
{
	protected String BookName;
	protected int numberOfPages;
	
	public Books(String BN, int Np) 
	{
		this.BookName = BN;
		this.numberOfPages = Np;
	}	
	public void DisplayBook() 
	{
		System.out.println("we are going to get in next class.");		
	}	
}
class BigBook extends Books
{
	public String instructor;
	public BigBook(String BN, int Np, String ins) 
	{
		super(BN, Np);
		this.instructor = ins;		
	}
	public void DisplayBookIns() 
	{
		System.out.println(this.BookName + this.instructor);
	}
	public void DisplayPages()
	{    
		System.out.println(this.numberOfPages);
		
	}
}