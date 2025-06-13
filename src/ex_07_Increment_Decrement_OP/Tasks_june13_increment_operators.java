package ex_07_Increment_Decrement_OP;

public class Tasks_june13_increment_operators {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
              //  5 6   7
        System.out.println("a:" +a + ", b : " +b
        );

        int i = 1;
        i = i++ + ++i;
          //  1 2    3

        System.out.println(i);

        int x = 5;
        System.out.println(x++ + ++x);
                          //5 6    7

        x = 5;
        System.out.println(++x);
                         //  6
        System.out.println(x++);
                         //6 7
        System.out.println(x);
                         //7

           a = 5;
      int  cb = a++ + ++a;
      //       5 6   7

        System.out.println("a: " + a);//a=7 ---> latest value of a would be 7
        System.out.println("b: " + cb);


        x = 5;
        int y = x++ + ++x + x++ + ++x;
        //      5 6   7     7 8    9
        System.out.println("x = " + x + ", y = " + y);
    }
}
