package ex_17_jun_while_loop;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {
        System.out.println("well come to the factorial program >>>> Enter the number");
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()){
            System.out.println("Enter the int you fool");

            return;
        }
        int num = scanner.nextInt();

        long factorial = 1;
        if(num<0){
            System.out.println("negative num fact is not allow");
         return;

        }
        if (num<=0){
            System.out.println(factorial);
        }
        else {
            for(int i = 1; i<= num; i++){
                factorial = factorial*i;

            }
        }
        System.out.println("factorial "+factorial);
    }
}
