package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {20,44,48,69,10, 20, 30,28, 40 ,50};
        System.out.println("_______________");

        for (int i = 0; i <=marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);

        for (int i = 0; i <=marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
