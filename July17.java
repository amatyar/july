package July;
import java.io.*;
import java.lang.*;
import java.util.*;

public class July17 
{
	//int amount = 100;
	public static void main(String[] args)
	{
		Dev33  d3 = new Dev33();
		d3.account();
		d3.deposite();
		d3.loan();
		d3.withdraw();
		

	}
}

 interface BankOfAmerica 
 {
	public void deposite();
	public void withdraw();
	public void loan();
	public void account();	 
 }
 
 abstract class Developer implements BankOfAmerica
 {
	public void deposite()
	{
		System.out.println("your deposite amount:" + 1000);
	}
 }
 abstract class Developer1 extends Developer
 {
	 public void withdraw() 
	 {
		 System.out.println(" you withdraw :"+ 350);
	 }
	 
 }
 class Dev33 extends Developer1
 {
	 public void loan()
	 {}
	 public void account() 
	 {}
	 
 }