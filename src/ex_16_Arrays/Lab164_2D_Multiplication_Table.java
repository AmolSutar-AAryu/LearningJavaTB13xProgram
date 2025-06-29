package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2D_Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
}
