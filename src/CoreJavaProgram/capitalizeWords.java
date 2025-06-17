package CoreJavaProgram;

public class capitalizeWords {

    public static void main(String[] args) {
        String sentence = "my name is amol sutar";
        String[] words = sentence.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for(String word : words){
            stringBuilder.append(Character.toUpperCase(word.charAt(0))).
                    append(word.substring(1)).append("");
            System.out.println(stringBuilder.toString());
        }

    }
}
