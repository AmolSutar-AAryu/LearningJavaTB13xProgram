package ex_06_Ternary_operator;

public class Lab068_To_Three_Max {

    public static void main(String[] args) {
        // Find the maximum between the three numbers.
        // Now we will be using the logic building formula.

        int a = 2; int b = 9; int c = -10;

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        // Step 3
//        int max = (n1> n2) ? A : B;

            int max = (a>b) ? (a>c) ? a: c:  (b > c) ? b :c;


        System.out.println(max);
    }
}
