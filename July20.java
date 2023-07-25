package July;

public class July20
{
	public static void main(String[] args) 
	{

		univ TU = new univ("Kathmandu", "Technology");
		univ KU = new univ("pokhara", "ARTS");
			TU.welcome();
		univ.College A = TU.new College();
		univ.College B = KU.new College();

		A.faculty();
		B.faculty();
		

	}
}

class univ{
	String uName;
	String uBranch;
	public univ(String name, String branch) 
	{
	this.uName = name;
	this.uBranch = branch;
	}

	public void welcome() 
	{
			System.out.println("welcome in university".concat(this.uName));
	}

//inner class

	class College 
{
String faculty;

	public void faculty()
{
  if(univ.this.uBranch.equals("Technology"))
  {
    this.faculty = "medical";
    System.out.println(this.faculty);
  }
   else if(univ.this.uBranch.equals("ARTS")) 
   {
    this.faculty = "music";
    System.out.println(this.faculty);
  }
	}
	}
}
