package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s = "AMOL";
        String s1 = new String("AMOL");

        StringBuffer stringBuffer = new StringBuffer("AMOL");
        StringBuilder stringBuilder = new StringBuilder("AMOL");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
