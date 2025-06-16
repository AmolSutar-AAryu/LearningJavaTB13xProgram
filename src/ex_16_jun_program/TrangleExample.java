package ex_16_jun_program;

import java.util.Scanner;

public class TrangleExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1 value:");
        int side1 = scanner.nextInt();

        System.out.println("Enter side 2 value:");
        int side2 = scanner.nextInt();

        System.out.println("Enter side 3 value:");
        int side3 = scanner.nextInt();

        if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2){

            if(side1 == side2 && side2 == side3){
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("Isosceles Triangle");
            }
            else {
                System.out.println("Scalene Triangle");
            }


        }
        else {
            System.out.println("Not a valid triangle");
        }
    }
}
