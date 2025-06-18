package CoreJavaProgram;

import java.util.Scanner;

public class LeapYearProgram {

    public static void main(String[] args) {
        System.out.println("Enter the year do you  want to check");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year % 4 ==0 || year % 400== 0){
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year+"is not leap year");
        }
    }
}
