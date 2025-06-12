package CoreJavaProgram;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2025;
        if ((year % 4 == 0) ||  (year % 400 == 0) ) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " year is not leap");
        }


    }
}
