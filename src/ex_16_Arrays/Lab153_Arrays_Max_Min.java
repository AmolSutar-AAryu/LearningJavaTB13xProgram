package ex_16_Arrays;

import java.awt.font.FontRenderContext;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] arr = {10,20,13,29,32,15,38,27,43,22,1};
        int max_outout = give_me_max(arr);
        int min_out = give_me_min(arr);
        System.out.println(max_outout);
        System.out.println(min_out);
    }

    private static int give_me_min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    static int give_me_max(int[] arr) {
         int max = arr[0];
         for (int i = 0; i <arr.length ; i++) {
             if (arr[i]>max){
                max = arr[i];

             }
         }
      return max;
    }

}
