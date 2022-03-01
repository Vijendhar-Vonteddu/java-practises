class Faculty{
	String name="Vijay";
	int id;
          Faculty()                                             //default constructor
          {  
        	  System.out.println(name + " " + id);
          }
          Faculty(int x,int y)                                   //parametrised constructor
        	  {
        	    System.out.println(x+" "+y);
        	  }
          }
public class Constructors
{
   public static void main (String args[])                                    //main method
   {
	   new Faculty();
	   new Faculty(100,200);
	       
   }
}
