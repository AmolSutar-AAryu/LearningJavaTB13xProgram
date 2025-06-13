package ex_06_UserInput;

public class Lab_UserInput_CLI {

    public static void main(String[] args) {
        String age_stirng = args[0];
        System.out.println(age_stirng);
        int age = Integer.parseInt(age_stirng);
        String cna_I_vote = age >= 18 ? "yes":"no";
        System.out.println(cna_I_vote);

    }
}
