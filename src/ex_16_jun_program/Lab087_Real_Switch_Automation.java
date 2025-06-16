package ex_16_jun_program;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        System.out.println("Enter the browser name");
        Scanner  scanner = new Scanner(System.in);
        String browser = scanner.next();

        switch (browser){
            case "crome" :
                System.out.println("Starting the chrome");
                break;
            case "firefox" :
                System.out.println("Starting the FireFox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I hva no idea about this browser");


        }
    }
}
