package javaString;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);

        String demo = scanner.next();

        int vols = 0;
        int conls = 0;

        demo = demo.toLowerCase();

        for(int i =0; i < demo.length(); i++){
            char ch = demo.charAt(i);

            if(ch>='a' &&  ch<='z'){
                if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
                    vols++;
                else
                    conls++;
            }

        }
        System.out.println("vols" + vols);
        System.out.println("conls" + conls);
    }
}

