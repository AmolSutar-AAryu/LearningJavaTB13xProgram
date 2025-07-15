package ex_32_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("AMOL");
        vector.add("APU");
        vector.add("AARYAN");


        System.out.println(vector);
        System.out.println(vector.contains("SUTAR"));

        System.out.println(vector);

        for (int i = 0; i < vector.size() ; i++) {
            System.out.println(vector.get(i));
        }

        System.out.println("ENUMRNATION_____________");

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
