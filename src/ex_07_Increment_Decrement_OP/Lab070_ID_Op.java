package ex_07_Increment_Decrement_OP;

public class Lab070_ID_Op {
    public static void main(String[] args) {
        int a =  20;
        int b = ++a;  // 10+1 assigned // pre - increment
        int d = 30;
        int c = d++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //  Exp and Result Table
        // Line No | a | Result b
        //  8 |  10 |  NA
        // 9 |  11 |  11
        // 10 | 11(NA) | 11
        // 11 | 11 | 11(NA)
    }
}
