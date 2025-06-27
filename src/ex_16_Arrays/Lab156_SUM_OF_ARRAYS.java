package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int [] arr = {22,33,44,55};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
         sum= sum+arr[i];
           // System.out.println(sum);
        }
        System.out.println(sum);
    }

}
