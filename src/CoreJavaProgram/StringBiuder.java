package CoreJavaProgram;

public class StringBiuder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Amol");
        stringBuilder.append(" ");
        StringBuilder sutar = stringBuilder.append("Sutar");

         String result = stringBuilder.toString();

        System.out.println(stringBuilder);

        int i = 20;
        String str = "The ans is"+ String.valueOf(i);

        String a = "Amol";
        String b = "Sutar";
        String c = "Koor";

        String d = a.concat(" ").concat(b).concat(c);
        System.out.println(d);
    }
}
