package ex_32_Collection_Framework_DSA.LIST;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Lab243_AL {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(10);

        arrayList.add("10");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("3");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add(true);


        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(7));

        System.out.println(arrayList.indexOf(3));
        System.out.println(arrayList.lastIndexOf("3"));


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("_______________________________");
        for (Object o : arrayList)
            System.out.println(arrayList);

    }


}
