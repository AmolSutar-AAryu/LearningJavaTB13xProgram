package ex_16_jun_program;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        //
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error


        // int day = Integer.parseInt(args[0]);

        System.out.println("Enter tha day 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case  1 :
                System.out.println("mon");
                break;
            case  2 :
                System.out.println("tus");
                break;
            case  3 :
                System.out.println("wed");
                break;
            case  4 :
                System.out.println("thur");
                break;
            case  5 :
                System.out.println("fri");
                break;
            case  6 :
                System.out.println("sat");
                break;
            case  7 :
                System.out.println("sun");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
