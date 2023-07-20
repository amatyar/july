package July;

public class July19 
{

	public static void main(String[] args) 
	{
		
		HospitalBMC BMC = new HospitalBMC();
		BMC.DeptStaff();
		
		HospitalBMC.Department  Dpt= BMC.new Department();
		String ad= Dpt.totalMember();
		System.out.println(ad);
	}

}
class HospitalBMC
{
	int staff = 500;
	String Dept = "Multi Department";
	
	class Department
	{
		String member;
		
		
		public String totalMember()
		{
			return "Volunter";
			
		}
	}
	
	public void DeptStaff() 
	{
		System.out.println(this.Dept +" has "+ this.staff);
	}
}
