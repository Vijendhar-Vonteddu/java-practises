
 abstract class Student{                           //defined abstract class
	String name;
     int id;
     char  surnmae;
      public int a=1,b=3,c;
      Student(int d){                                      //parametrised consructor
    	  System.out.println( "hello" +d);
    	  
      }
      
     void details(int x,int y) {
    	this.a=x;
    	this.b=y;
    	c=a+b;
    	 System.out.println("sai siddhartha school" + c);
     }
	abstract void studentDetails();                    //abstract method(hiding implementation)
}
class Information extends Student{
	Information()
	{                                    //default consructor
		super(18);                                    //superclass constructor 
		System.out.println("this is vijay");
	}
	int a=50;
	void fast() {
		System.out.println(super.a);                  //super variable
		System.out.println(this.a);                        //current value
		super.details(56,67);						    //super method
	}
	void studentDetails() 
	{
	 String name="Vijay";                            //implemetation 
	 int id=345;
	 char surname='v' ;
	 System.out.println("Student details:"+name);
	 System.out.println("Student id:"+id);
	 System.out.println("Student surname:"+surname);
	}
}
public class Abstraction {

	public static void main(String[] args) {
	Information i=new Information();
	i.studentDetails();
	i.fast();
	

	}

}

