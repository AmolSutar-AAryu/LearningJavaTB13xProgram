package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous

        LinkedList linkedList = new LinkedList();
        linkedList.add("AMOL");
        linkedList.add("RAHUL");
        linkedList.add("MANDAR");
        linkedList.add("GNAESH");
        linkedList.add("AMOL");
        linkedList.add(null);
        linkedList.add(true);
        linkedList.add(123);

        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains("AMOL"));
        System.out.println(linkedList.indexOf(123));
        System.out.println(linkedList.get(0));


      Iterator iterator = linkedList.iterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }







    }
}
