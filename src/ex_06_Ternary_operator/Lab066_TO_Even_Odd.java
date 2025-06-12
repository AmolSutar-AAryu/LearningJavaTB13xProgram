package ex_06_Ternary_operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {
        int num = 19;

        String result = (num % 2 ==  0) ? "even" : "odd";
        System.out.println(result);
    }
}
