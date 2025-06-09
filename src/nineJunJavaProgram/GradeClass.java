package nineJunJavaProgram;

public class GradeClass {
    public static void main(String[] args) {
        int score = 75;
        char grade = 'e';
        if (score >= 90 && score <= 100)
            grade = 'A';
         else if(score >= 80 && score <= 90){
            grade = 'B';
        }
        else if(score >= 70 && score <= 80){
            grade = 'c';
        }
        else if(score >= 60 && score <= 70){
            grade = 'd';
        }
        else if(score >= 50 && score <= 60){
            grade = 'e';
        }
        System.out.println("Your grade is: " + grade);

    }

}
