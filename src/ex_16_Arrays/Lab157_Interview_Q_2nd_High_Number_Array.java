package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int arr[] ={39,43,28,32,58,45};
        Arrays.sort(arr);
        System.out.println(arr.length-2);
        System.out.println(arr[arr.length-2]);

    }
}
