package July;


public class July6A 
{
	public static void main(String[] args) 
	{
		Clinic cl = new Clinic("Boston Hospital", 305 , 'c', 114);
		cl.DisplayHospital();
		System.out.println("--------Next Case-----");
		Room rm = new Room("Cambridge Hosp.", 211, 'A', 105, "Normal");
		rm.DisplayHospital();
		System.out.println("--------Next Case-----");
		DepartmentOf DP = new DepartmentOf("Quincy Hospt", 505, 'T', 224, "Orthopiadic");
		DP.DisplayHospital();
	}

}
class Hospital
{
	String Name;
	int ward;
	char code;
	
	public Hospital(String Nm, int wd, char cd) 
	{
		this.Name = Nm;
		this.ward = wd;
		this.code = cd;
	}
	public void DisplayHospital()
	{
		System.out.println("Name of Hospital: "+this.Name +"Ward number: "+ this.ward+" Code:" + this.code);
	}
	
	
}
class Clinic extends Hospital
{
	int BedNo;
	
	public Clinic(String Nm, int wd, char cd, int bn) 
	{
		super(Nm, wd, cd);
		this.BedNo = bn;
		
	}
	// overriding
	public void DisplayHospital() 
	{
		System.out.println("Bed number "+this.BedNo);
		super.DisplayHospital();
	}
}
class Room extends Clinic
{  
	String note;
	public Room(String Nm, int wd, char cd, int bn, String nt ) {
		super(Nm, wd, cd, bn);
		this.note= nt;
	}
	// overriding
	public void DisplayHospital()
	{
		System.out.println("Condition"+this.note);
		super.DisplayHospital();
	}
	
}
class DepartmentOf extends Hospital
{
	int DeptNo;
	String DeptName;
	
	public DepartmentOf(String Nm, int wd, char cd, int dn, String DNm) 
	{
		super(Nm, wd, cd);
		this.DeptNo = dn;
		this.DeptName = DNm;
	}
	// overriding
	public void DisplayHospital() 
	{
		System.out.println("Department Name :"+this.DeptName+"Department number: "+this.DeptNo);
		super.DisplayHospital();
	}
	
}
	
