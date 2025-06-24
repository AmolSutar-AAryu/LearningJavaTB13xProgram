package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Interview_Vowels {
    public static void main(String[] args) {
        // Java Program to Count Vowels and Consonants
        System.out.println("input any String:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int vovels = 0;
        int conls = 0;

        input = input.toLowerCase();
        System.out.println(input);
        for(int i = 0; i <  input.length(); i++ ){
            char ch = input.charAt(i);
            if (ch =='a' || ch == 'e' || ch =='i' || ch == 'o' ||ch == 'u') {
                vovels++;
            }
            else {
                conls++;
            }


        }
        System.out.println("vovels "+ vovels);
        System.out.println("conls" + conls);
    }
}
