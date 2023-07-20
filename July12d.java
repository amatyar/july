package July;

public class July12d {
// Abstract class with abstract method
	public static void main(String[] args) {
		Bakery bk= new Bakery();
		bk.Deli();
		bk.frozen();

	}

}
abstract class BJstore{
	abstract void frozen();
	public void Deli()
	{
		System.out.println(" we sell fresh meat.");
	}
}
class Bakery extends BJstore{

	@Override
	void frozen() {
		System.out.println(" we sell organic frozen food.");
		
	}
	
}