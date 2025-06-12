package ex_12_jun_typecasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
        //int total = course+gst; // narrow inplicit
        int total = course+(int)gst; //narrow explicit
        System.out.println(total);

        float total1 = (int)course+gst; //widening implicit
        float total3 = (float)course  + gst; // widening explicit

        System.out.println(total1);
        System.out.println(total3);
    }
}
