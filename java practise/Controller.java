class Checking                                      
{
	int a=12;                                      
     int b=3;
	void reserving()                               
	{
		do 
		{
		   System.out.println(a);
		    a--;
		}
		   while (a>6);
		 
        
      }
}


public class Controller {
	public static void main(String args[]) {
		Checking c=new Checking();                                  
		c.reserving();                                   
	}
}