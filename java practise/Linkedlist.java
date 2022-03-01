
    import java.util.*;  
public class Linkedlist{  
 public static void main(String args[]){  
 LinkedList<String> ll=new LinkedList<String>();  
           System.out.println("first list of elements: "+ll);  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           System.out.println("After  insertion list" );
         
           ll.add( "Gaurav");  
           System.out.println("After  adding print the elememt");  
           LinkedList<String> ll2=new LinkedList<String>();  
           ll2.add("Sonoo");  
           ll2.add("Hanumat");  
           ll.addAll(ll2);  
           System.out.println("After creating list 2 print all the collections");  
           LinkedList<String> ll3=new LinkedList<String>();  
           ll3.add("John");  
           ll3.add("Rahul");  
           ll.addAll(1, ll3);  
           System.out.println("After  creating list 3 print all the collections" );  
           ll.addFirst("Lokesh");  
           System.out.println("print the list after adding");    
           ll.addLast("Harsh");  
           System.out.println("print the list after adding");  
             
 }  
}  
    

