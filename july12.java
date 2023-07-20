package July;

public class july12 
{

	public static void main(String[] args) 
	{
		 Derived d = new Derived(); 
         //d.setData(20) ; //to set private member i 
         d.j = 10 ; 
         d.product(); 
	 }    

}

class Base 
{    
		//private member 
       private int i = 210;  
       
       public void setData(int n) 
       { 
    	 //private member accessed within the class 
         this.i = n;
       } 
     //private member accessed within the class
       public int getData() 
       { 
         return i; 
        } 
} 
class Derived extends Base 
      { 
            int j ; 
             public void product() 
         { 
             int num =getData(); 
             System.out.println("product = " + (j * num)); 
         } 
     } 