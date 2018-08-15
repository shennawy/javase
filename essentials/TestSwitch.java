package javase.essentials;

public class TestSwitch {
    public static void main(String[] args) {

        char gradeApprev = 'A';
        String grade;

        switch (gradeApprev) {
        case 'A':
            grade = "Excellent";
            break;
        case 'B':
            grade = "Very Good";
            break;
        case 'C':
            grade = "Good";
            break;
        case 'D':
            grade = "Poor";
            break;
        case 'F':
            grade = "Fail";
            break;
        default:
            grade = "Not Defined";
        }
        
        System.out.println("Grade = " + grade);
    }
}
