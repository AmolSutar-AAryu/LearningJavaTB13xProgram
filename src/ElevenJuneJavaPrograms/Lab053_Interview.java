package ElevenJuneJavaPrograms;

public class Lab053_Interview {
    public static void main(String[] args) {
        long l = 10l; // 8 Byte, 64 Bits
        String s = "name"; //  8 Byte, 64 Bits

        char a1 = 'A'; // ASCII - 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1);

        System.out.println('A' == 65);

        short w = 10;
        char c = 'A';
        String s1 = "A";
        System.out.println(c+w);
        System.out.println(c);
        System.out.println(c+c);
        System.out.println(c+s1);
    }
}
