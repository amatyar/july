package July;

public class July18B 
{

	public static void main(String[] args) 
	{
		Trans tra= new Trans();
		tra.Cards("Charlies card");
		tra.MBTA(99);
		tra.Parking(25);
		tra.ride(33.25);

	}

}
interface Massachussett{
	void MBTA(int fares);
	void Cards(String passes);
	
}
interface Boston{
	void Parking(int fees);
	void ride(double prices);	
}

class Trans implements Massachussett, Boston 
{

	@Override
	public void Parking(int fees) {
		System.out.println("Paring fees is:\t$" + fees);
		
	}

	@Override
	public void ride(double prices) {
		System.out.println("Ride fees is:\t$" + prices);
		
	}

	@Override
	public void MBTA(int fares) {
		System.out.println("Bus , train fares fees is:\t$" + fares);
		
	}

	@Override
	public void Cards(String passes) {
		System.out.println("Passes fees is:\t$" + passes);
		
	}
	
}
