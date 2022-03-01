class Inheritance1{                                                   
	int a;                                                             
	void done() {                                              
		System.out.println(a);
	}
}
class Inheritance2 extends Inheritance1{
	int b;                                                          
	void mark(int x,int y) {                                         
		System.out.println(b);
	}
    void mark(float m,float n) {                                        
    	System.out.println(m+" "+n);
    }
}
class Inheritance3 extends Inheritance2{
	int c;                                                           
	void present() {
		System.out.println(c);
	}
	void done() {                                                           
		System.out.println("hii");


	}
}

public class Inheritance
 {

	public static void main(String[] args) {
		Inheritance3 o=new Inheritance3();
		o.present();                                                     

		o.mark(12.0f,12.23f);                                      
		o.done();
    }
}