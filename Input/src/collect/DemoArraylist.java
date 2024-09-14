package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArraylist {

    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();

        list.add(9);
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(9);

        Iterator<Integer> it= list.iterator();
        while(it.hasNext())
        {
            System.out.println("List from the iterator: " +it.next());
        }

    }

}
