package ElevenJuneJavaPrograms;

public class Lab048_Interview {
    public static void main(String[] args) {
int balaji_sal = 5;
boolean b = !(balaji_sal >10 || balaji_sal<5);
        System.out.println(b);

        // A - balaji_sal > 10 -> 12 > 10 -> true
        // B -> balaji_sal < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
