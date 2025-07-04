package polymorphsim.methodoverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        Math math = new Math();
        math.add(1, 2);
        math.add(222, 333);
        math.add("amol", "sutar");

    }
}

class Math {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;

    }
}
