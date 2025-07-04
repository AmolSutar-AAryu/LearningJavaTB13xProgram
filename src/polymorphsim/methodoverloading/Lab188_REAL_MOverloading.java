package polymorphsim.methodoverloading;

public class Lab188_REAL_MOverloading {
    public static void main(String[] args) {

    }
}

class Home{
    void task(){
        System.out.println("task 1");
    }

    int task(int a){
        return a;
    }

    boolean task(boolean a){

        return false;
    }
}