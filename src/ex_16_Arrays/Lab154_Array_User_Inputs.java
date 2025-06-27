package ex_16_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        int[] sub_mark = new int[mark];

        for (int i = 0; i < sub_mark.length; i++) {
            sub_mark[i] = scanner.nextInt();
        }
        for (int i = 0; i < sub_mark.length ; i++) {
            System.out.println(sub_mark[i]);
        }
    }
}
