package ex_18_jun_Function;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        wp_wr_greet();
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        greet_with_details("amol", 36, 100);

        int sum = sum_of_two_numbers(11, 11);
        int sum1 = sum_of_two_numbers(22, 22);
        int sum2 = sum_of_two_numbers(33, 33);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);


    }

    static void wp_wr_greet() {
        System.out.println(" -- Type 2 : Without Parameters but With Return Type -- ");
        System.out.println("wp_with_RT");
    }

    //  2. Without Parameters but With Return Type
    static String greet_with_hello_wp_with_RT() {
        System.out.println(" -- Type 2 : Without Parameters but With Return Type -- ");
        System.out.println("wp_with_RT");
        return "Hi, are you?";
    }

    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Youe name " + name + "your age " + age + "your sal" + salary);
    }

    static int sum_of_two_numbers(int a, int b) {
        return a + b;


    }
}
