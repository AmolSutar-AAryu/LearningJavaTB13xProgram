package TenJunJavabasicProgram;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("print command print without new line ");
        System.out.println("hello world");
        System.out.println("added new line in the end");


        System.out.println(a);
        System.out.printf("your variable name is %d", a);


        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int b = 20;
        System.out.println("----");
        System.out.printf("%d * %d",a,b);
    }
}
