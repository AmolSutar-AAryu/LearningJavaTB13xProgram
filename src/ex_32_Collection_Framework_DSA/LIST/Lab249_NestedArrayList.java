package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {
        LinkedList friuts = new LinkedList();

        friuts.add("MANgo");
        friuts.add("Banana");
        friuts.add("Apple");
        System.out.println(friuts);

        LinkedList friuts1 = new LinkedList();
        friuts1.add("Papaya");
        friuts1.add("jackFriut");
        System.out.println(friuts1.add(friuts));
        System.out.println(friuts1);


        LinkedList vegatables =  new LinkedList();

        vegatables.add("Palak");
        vegatables.add("Colifolwer");
        vegatables.add("potato");

        System.out.println(vegatables);

        System.out.println(vegatables.add(friuts));
        System.out.println(vegatables.add(friuts1));

        LinkedList allvagetable = new LinkedList();

        allvagetable.add(friuts);
        allvagetable.add(friuts1);
        allvagetable.add(vegatables);

        System.out.println(allvagetable);

        System.out.println(allvagetable.get(2));




    }
}
