package CoreJavaProgram;

public class SwapNumber {
    public static void main(String[] args) {
        int p = 6;
        int q = 8;
        System.out.println("p is " + p + " and q is " + q);

        int temp;
        temp = p;
        p = q;
        q = temp;

        System.out.println("after swaping the number p is " + p + " and q is " + q);
    }

}
