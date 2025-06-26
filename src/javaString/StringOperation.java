package javaString;

public class StringOperation {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "hello";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.compareTo(s3));


        String str = "amolsutar";
        String str1 = "aaryan";

        String str3 = str.concat(str1);
        System.out.println(str3);

        System.out.println(str.length());
        System.out.println(str.substring(2, 3));

        String str4 = "Test";

        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + ": " + str4.charAt(i));
        }



    }
}

