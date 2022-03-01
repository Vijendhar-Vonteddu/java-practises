import java.util.HashSet;

public class HashSet1 {
    public static void main (String[] args){
        HashSet<String> set=new HashSet<String>();
         set.add("mani");
         set.add("pavan");
         set.add("raju");
         System.out.println("print the list of elemments");
         set.remove("mani");
         System.out.println("print the elements after removing");
         HashSet<String>set1=new HashSet<String>();
         set1.add("mummy");
         set1.add("daddy");
         set.addAll(set1);
         System.out.println("updated list");
         set.removeAll(set1);
         System.out.println("print all the elements after removing set1");
         set.clear();
         System.out.println("print the elements after clearing");
        

    }
    
}
