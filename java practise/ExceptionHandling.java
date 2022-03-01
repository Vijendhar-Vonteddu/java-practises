import java.util.Scanner;

public class ExceptionHandling {  
    public static void main (String[] args){  
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("write your favourite number?");
            try {
                int n=scan.nextInt();
                System.out.println(n);

            
            }
                catch (Exception e){
                    System.out.println("sorry,please enter your number");

                }
                finally {  
                    System.out.println("finally block is always executed");  
                    }    
                        
                    System.out.println("rest of phe code...");    
                      }    
                    }    
                    
                
        
        }
    
            
        
    


        
    
    

