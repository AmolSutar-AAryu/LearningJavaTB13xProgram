package ex_32_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String>  vector = new Vector<>();

        vector.add("AMOL");
        vector.add("SUMIT");
        vector.add("AARYAN");
        vector.add("APU");
        System.out.println(vector);

        ListIterator iterator = vector.listIterator(); {
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }

        ListIterator iterator1 = vector.listIterator();

        while (iterator1.hasPrevious()){
            System.out.println(iterator1.previous());
        }

        System.out.println(" --- ");

        Iterator iterator3 = vector.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
    }


}
