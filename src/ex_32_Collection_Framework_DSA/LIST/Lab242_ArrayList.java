package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("AMol");
        al.add("SUTAR");
        al.add("AARYAN");
        al.add(1234);
        System.out.println(al);
        System.out.println(al.size())   ;


        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
