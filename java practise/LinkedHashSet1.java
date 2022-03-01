import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main (String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("mukesh");
        al.add("ramu");
        al.add("janu");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
    
    
}
