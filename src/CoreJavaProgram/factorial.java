package CoreJavaProgram;

public class factorial {
    public static void main(String[] args) {
        int num = 5;
        var fac =1;
        for(int i =1; i<=num; i++){
         fac*=i;
        }
        System.out.println("CoreJavaProgram.factorial of num is " + fac);
    }
}
