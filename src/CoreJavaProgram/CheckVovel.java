package CoreJavaProgram;

import java.util.Scanner;

public class CheckVovel {
    public static void main(String[] args) {
        System.out.println("Enter Char to check vovel");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Enter char is vovel");
        } else {
            System.out.println("Enter char is not vovel");
        }
    }
}
