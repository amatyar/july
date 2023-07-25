 package July;

public class JulySunday1 
{
//for inner class
	public static void main(String[] args) 
	{
		Subject sb= new Subject("Basic math", "Mathematics");
		Subject.Teacher te = sb.new Teacher();
		te.setTeacher();
		System.out.println(te.getSubTeacher());
		
		Subject sb1= new Subject("Introduction to Geo","Geography");
		Subject.Teacher te1 = sb1.new Teacher();
		te1.setTeacher();
		System.out.println(te1.getSubTeacher());
	}
}
class Subject
{
	String subName;
	String subDepartment;
	 // constructor
	public Subject(String sn, String sd)
	{
		this.subName       = sn;
		this.subDepartment = sd;		
	}
	// private method
	private String displaySubName()
	{
		return this.subName;
	}
	
	//create inside class
	class Teacher
	{
		String subTeacher;
		
		// method
		public void setTeacher() 
		{
			//Accessing subDepartment property of subject
			if(Subject.this.subDepartment.equals("Mathematics")) 
			{ //Accessing private method 
				if(Subject.this.displaySubName().equals("Introduction to Geo"))
				{
					this.subTeacher ="Best Teacher";					
				}
				//Accessing private method
				else if(Subject.this.displaySubName().equals("basic Math"))
						
				{
					this.subTeacher ="Average teacher";
				}
				else
				{
					this.subTeacher = "Not in active";
				}
			}
			else
			{
				this.subTeacher ="Average teacher";
			}
		}
		 // method
		public String getSubTeacher()
		{
			return this.subTeacher;
		}
	}
}