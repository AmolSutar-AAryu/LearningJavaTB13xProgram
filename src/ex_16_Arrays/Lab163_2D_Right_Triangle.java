package ex_16_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
