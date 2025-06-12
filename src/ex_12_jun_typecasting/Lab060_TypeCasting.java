package ex_12_jun_typecasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long ph_no = 9503148662l;
        //short s = ph_no; //Implicit Narrow?
        short s1 = (short)ph_no; //Explicit Narrow?
    }
}
