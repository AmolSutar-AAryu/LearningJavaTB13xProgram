package ex_16_jun_program;

import java.util.Scanner;

public class Lab086_Switch
{
    public static void main(String[] args) {
        System.out.println("enter the day");
        Scanner  scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("mom");
            case 2:
                System.out.println("tues");
            default:
                System.out.println("invalid day4");
        }
    }
}
