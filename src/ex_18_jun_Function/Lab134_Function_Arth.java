package ex_18_jun_Function;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {

        System.out.println("Enter value of a");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        if (scanner.hasNext()) {
            a = scanner.nextInt();
        } else {
            System.out.println("pls enter int value");
            return;

        }
int b = 0;
        if(scanner.hasNext()){
           b = scanner.nextInt();
        }
        else {
            System.out.println("pls enter int value");
        }


        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


    }
    static  int sum(int a, int b){
        return a+b;
    }

    static  int sub (int a, int b){
        return a-b;
    }
    static  int mul (int a, int b){
        return a*b;
    }
    static  int div (int a, int b){
        return a%b;
    }
    static  int mod (int a, int b){
        return a/b;
    }
}
