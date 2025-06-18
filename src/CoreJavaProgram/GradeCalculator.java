package CoreJavaProgram;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner scanner = new Scanner(System.in);

        int percentage = scanner.nextInt();

        if(percentage<100 && percentage>90){

            System.out.println("A grade");
        }
        else if (percentage<90 && percentage>80){
            System.out.println("B grade");
        }
        else if (percentage<80 && percentage>70){
            System.out.println("C grade");
        }
        else if (percentage<70 && percentage>60){
            System.out.println("D grade");
        }
        else if (percentage<60 && percentage>50){
            System.out.println("E grade");
        }
        
    }
}
