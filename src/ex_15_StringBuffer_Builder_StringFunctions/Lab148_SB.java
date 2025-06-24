package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("AMOLSUTAR");

        sb.delete(7,8);
        System.out.println(sb);
        sb.append("KOOR");
        System.out.println(sb);
        sb.replace(0,4,"AARYAN");
        System.out.println(sb);


    }
}
