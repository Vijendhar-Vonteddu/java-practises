import java.util.ArrayList;
import java.util.List;

class ArraylistToArray {
    private static final Object[] Array = null;

    public static void main(String [] args){
        List<String>mmlist=new ArrayList<String>();       
        mmlist.add("vijendhar");
        mmlist.add("reddy");
        mmlist.add("vonteddu");
        mmlist.toArray(Array);
        System.out.println("print Array; + Arrays.toString(Array)");
        System.out.println("printing list; +mmlist");
    }
    
}
