package ex_16_Arrays;

public class Pyramid_demo_pattern {
    public static void main(String[] args) {
        int row = 3; // Number of rows

        for (int i = 1; i <= row; i++) {
            // print leading spaces
            for (int j = 1; j <= row -i; j++) {
                System.out.print(" ");
            }
            // Print stars (2*i - 1 gives 1, 3, 5, ...)
            for (int k = 1; k <=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
