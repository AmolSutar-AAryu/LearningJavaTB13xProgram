package javaString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter Stirng to check palindrome");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String newstr =  new StringBuilder(str).reverse().toString();

        if (str.equals(newstr)){
            System.out.println("given sting is palindrome");
        }
        else {
            System.out.println("given str is not palindrome");
        }
    }
}
