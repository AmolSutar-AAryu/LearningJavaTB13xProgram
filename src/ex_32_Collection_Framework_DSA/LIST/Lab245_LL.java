package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab245_LL {
    public static void main(String[] args) {
        LinkedList animal = new LinkedList();
        animal.add("DOG");
        animal.add("cat");
        animal.add("Elephant");
        animal.add("cat");
        animal.add("LION");

        System.out.println("LINKED LIST" + animal);

        System.out.println("Frist Element : "+ animal.getFirst());
        System.out.println("Last Element : "+ animal.getLast());

        animal.removeFirst();
        animal.removeLast();

        System.out.println("LinkedList after removal " +animal);

        System.out.println("Size " +animal.size());
    }

}
