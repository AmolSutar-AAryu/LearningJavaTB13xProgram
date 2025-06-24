package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("amol");
        stringBuffer.append("Sutar");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        String s = "AMOL";
        String s1 = "SUTAR";

        String s2 = s+s1;

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
