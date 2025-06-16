package ex_16_jun_program;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {
        System.out.println("enter the day");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case  1 :
                System.out.println("mon");
            case 2:
                System.out.println("tues");
            case  3:
                System.out.println("wed");
            case 4:
                System.out.println("thur");
            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default:
                System.out.println("invalid day");
        }
    }
}
