package CoreJavaProgram;

public class ReverseString {
    public static void main(String[] args) {
        String orijinal = "AmolSutar";

        String reverse = new StringBuilder(orijinal).reverse().toString();

        System.out.println("orijinal "+orijinal);
        System.out.println("Reverse "+reverse);

    }
}
