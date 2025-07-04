package polymorphsim.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
    Cal cal = new Cal();
    cal.add(1,2);
    cal.add(1,2,3);
    }

}

class Cal {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}