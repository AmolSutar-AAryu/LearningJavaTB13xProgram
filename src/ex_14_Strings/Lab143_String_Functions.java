package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";// 0,1,2,3,4

        System.out.println(name.concat("Sutar"));

        System.out.println(name.contains("na"));

        System.out.println(name.equals("Sonal"));

        System.out.println(name.equalsIgnoreCase("sonal"));

        System.out.println(name.indexOf(0));

        String s = "AMOLA";

        System.out.println(s.indexOf('A'));

        System.out.println(s.lastIndexOf('A'));

        System.out.println(s.replace('A', 'B'));

        String name4 = "amol@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        System.out.println(name.substring(1,2));
        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("a"));


        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

    }
}
