public class Palindrome {
    public static void main(String[] args) {
        String  str = "MADAM";
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length()-1; i >=0; i--){
            reverse.append(str.charAt(i));
        }
        if (str.equals(reverse.toString())){
            System.out.println("the string is palindrome");
        }
        else {
            System.out.println("the sting is not palindrome");
        }
    }
}
