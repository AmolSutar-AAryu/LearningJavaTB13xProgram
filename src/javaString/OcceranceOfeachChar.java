package javaString;

public class OcceranceOfeachChar {
    public static void main(String[] args) {
        String input = "This is my name";

        char target = 'i';

        int count = 0;

        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {

            if (ch==target)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
