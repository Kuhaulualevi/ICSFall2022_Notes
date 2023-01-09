package classes;

public class Grading {
    
    public char determineGrade(int number) {
        if(number < 60) {
            return 'F';
        }
        else if (number < 70) {
            return 'D';
        }
        else if (number < 80) {
            return 'C';
        }
        else if (number < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
        
    }
}
