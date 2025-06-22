package javaString;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String str = "automation";
        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(result.indexOf(str.charAt(i)) == -1){
            result += str.charAt(i);
            }

        }
        System.out.println(result);
    }
}
