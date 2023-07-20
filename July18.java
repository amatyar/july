package July;
interface  Ploygram
{
	void area();
	default void perimeter(int ... sides) {
		int peri = 0;
		for(int side : sides)
		{
			peri += side;
		}
		System.out.println("Perimeter :\t"+ peri);
	};
}

class Rectangel implements Ploygram
{

	private int a,b;
	double area;
	
	public Rectangel(int i, int j) {
		this.a=i;
		this.b=j;
	}
	@Override
	public void area() {
		area = a * b;
		System.out.println("Area is :\t" + area);
	}
	
}
public class July18 
{

	public static void main(String[] args)
	{
		Rectangel rt = new Rectangel(5, 9);
		rt.area();
		rt.perimeter(5,9);
	}

}
