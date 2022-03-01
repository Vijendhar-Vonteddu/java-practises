import java.util.*;  
public class ArrayToArrayList1{  
     public static void main(String args[]){  
      String[] array={"Java","Python","PHP","C++"};                   //Creating Array
         System.out.println("Printing Array: "+Arrays.toString(array));  
           List<String> list=new ArrayList<String>();              //converting array to list 
            for(String lang:array){  
               list.add(lang);  
                 }  
                 System.out.println("Printing List: "+list);  
  
                 }
}