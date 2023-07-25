package July;

public class sirKoNote
{

	public static void main(String[] args)
	{
		Vegetable veg= new Vegetable();
		//System.out.println(veg.tomato);
		double aa = veg.priceShow();
		System.out.println("Price :\t"+aa);
		
		Vegetable.spanich sp= veg.new spanich();
		System.out.println("vegetable color :"+sp.clolor +"\tvegetable test :" +sp.test());
	}

}
class Vegetable
{
	double tomato = 1.69;
	 
	class spanich
	{
		String clolor = "Green";
		
		public String test()
		{
			return " testy";
		}
		
	}
	public double priceShow()
	{
		return this.tomato;
	}
}
