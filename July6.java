package July;
import java.util.Arrays;

public class July6 
{
		// for overriding 
	public static void main(String[] args) 
	{
		Active pro= new Active();
		int q = pro.Act(58, 64);
		System.out.println("Sum of two number : " +q);
		pro.Act(5, 6, 9);
		int ints[] = { 4,6,3,2,1};
		pro.Act(ints);
		System.out.println("*****************next case******");
		
		math mt= new math();
		int aa = mt.Act(4, 9);
		System.out.println(aa);
		mt.Act(4, 5, 9);
		mt.Act(ints);
	}

}
class Active {  

	public int Act(int i, int j) 
	{		
		return i + j;		
	}

	public void Act(int i, int j, int k)
	{
		System.out.println( i - j + k);		
	}

	public void Act(int[] ints)
	{
		System.out.println("Displaying an array:" + Arrays.toString(ints));
		
	} 		
		
}
class math extends Active
{
	@Override
	public int Act(int i, int j) {
		return i *j ;
		
	}
	@Override
	public void Act(int i, int j , int k) {
		System.out.println(i * j * k);
	}
	@Override
	public void Act(int[] ints) 
	{
		int sum = 0;
		for (int i : ints) 
		{
			sum += i;
		}
		System.out.println("Sum of integer array elements is " + sum);
	}
}