package ex_16_Arrays;

import java.util.Scanner;

public class StarPattern_pyramid_Task_of_27 {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

