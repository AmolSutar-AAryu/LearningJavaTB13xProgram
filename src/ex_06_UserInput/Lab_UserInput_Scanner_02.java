package ex_06_UserInput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        System.out.println(S);

        System.out.println("Enter the Int num");
        int in_input  = scanner.nextInt();

        System.out.println("Enter Double Value");
        System.out.println(in_input);
        Double d = scanner.nextDouble();
        System.out.println(d);
    }
}
