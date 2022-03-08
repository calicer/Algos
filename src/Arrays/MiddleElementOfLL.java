package Arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MiddleElementOfLL {

    public static void main(String[] args) {

        List<Integer> li = new LinkedList();
        int count = 0;

        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);

        Iterator i = li.listIterator();


        while(i.next() != null){
            count++;
        }

        if (count%2==0){
            System.out.println(li.get(count/2));
        }



    }
}
