package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();

        String  age1 = age >=18 ?   "yes" : "no";

        System.out.println(age1);

    }
}
