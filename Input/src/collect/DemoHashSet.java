package collect;
import java.util.*;


public class DemoHashSet {

    public static void main(String args[])
    {

    Set<String> list = new HashSet<String>();  // Output will be in random
    //Set<String> list = new TreeSet<String>();    // Output will be in Ascending order
    //Set<String> list = new LinkedHashSet<String>();  // Output will be in the same. Not in random

    list.add("Manchester_United");
    list.add("Chelsea");
    list.add("WestHam");
    list.add("Reading");
    list.add("lead");
    list.add("Arsenal");
    list.add("Manchester_United");
    list.add("WestHam");


    Iterator<String> it=list.iterator();
    while(it.hasNext())
    {
        String val = it.next();
        System.out.println("This is the list value: "+val);
    }

    }
}
