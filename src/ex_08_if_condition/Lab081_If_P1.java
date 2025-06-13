package ex_08_if_condition;

public class Lab081_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age > 18){
            System.out.println("Allow to vote");
        }
        else {
            System.out.println("not allow to vote20");
        }
    }
}
