package collect;
import java.util.*;
public class DemoHashMap {

    public static void main(String args[])
    {
        //Map<Integer, String> list = new HashMap<Integer, String>();
        //Map<Integer, String> list = new LinkedHashMap<Integer, String>();
        Map<Integer, String> list = new TreeMap<Integer, String>();

        list.put(2, "Manchester_United");
        list.put(4,"Chelsea");
        list.put(6, "Reading");
        list.put(9, "Liverpool");
        list.put(5, "Everton");
        list.put(7, "Fulham");
        list.put(10, "Manchester_United");
        list.put(2, "Totnaham");

        Collection<String> c = list.values();
        Iterator<String> itr= c.iterator();
        while (itr.hasNext())
        {
            
            System.out.println("This is the Map value:" +itr.next());
        }



 
    }

}
