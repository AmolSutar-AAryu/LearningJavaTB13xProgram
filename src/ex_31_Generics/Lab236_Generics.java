package ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {


        temp_sum(1,2);
        temp_sum(2.1,33.2);
        temp_sum("Amol", "Sutar");
    }

    static int temp_sum(int a, int b) {
        return a + b;
    }

static double temp_sum(double a, double b){
        return a+b;
}
static String temp_sum(String a,String b){

    return a+b;
}
}
