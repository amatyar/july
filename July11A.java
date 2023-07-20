package July;
/**
 * @author Rabindra
 *
 */
public class July11A 
{	
	public static void main(String[] args) 
	{
		
		 
		entratainment ent = new entratainment(200, 25.75, "Egals");
		ent.NumberOfSeat();
		System.out.println("_________Next Case_________");
		
		Consert ct = new Consert(200, 60.58, "Egles", "Boston");
		ct.AllInOne();
		
	}

}
class entratainment{
	 private int NoOfSeat;
	 protected double entranceFee;
	 protected String BandName;
	 
	 public entratainment(int ns, double ef,  String BN) 
	 {
		 this.NoOfSeat    = ns;
		 this.entranceFee = ef;
		 this.BandName    = BN;
	 }
	 
	 public void NumberOfSeat()
	 {
		 System.out.println("Total number of seat :\t"+this.NoOfSeat);
		 this.BandEntrance();
	 }
	 
	 private void BandEntrance()
	 {
		 System.out.println("Band Name :\t"+ this.BandName+ "\tCost :\t"+this.entranceFee);
	 }
}
class Consert extends entratainment
{
   protected String location;

	public Consert(int ns, double d, String BN, String ln) {
		super(ns, d, BN);
		this.location = ln;		
	}
	
	public void BandName() {
		// TODO Auto-generated method stub
		
	}

	public void LocationForEvent()
	{
		System.out.println("Our event Location : \t"+ this.location);
	}
	
	public void AllInOne() 
	{
		super.NumberOfSeat();
		this.LocationForEvent();
	}
	
}