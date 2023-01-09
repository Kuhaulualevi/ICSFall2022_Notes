import java.util.*;
import java.util.regex.*;

public class regExPractice {
    public static void main(String[] args) {
        // work to identify Social Security numbers
        System.out.println(Pattern.matches("\\d{3}-\\d{2}-\\d{4}", "023-14-1967"));

        // work to identify phone numbers
        System.out.println(Pattern.matches("\\([1-9]\\d{2}\\)\\d{3}-\\d{4}", "(808)397-0447"));

        String text = "ast"; 
        String pat = ".s";
        System.out.println(Pattern.matches(pat, text));
        
        
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Please enter your 10 digit Account Number: ");
        String userInput = keyboard.nextLine(); 

        String pat2 = "\\d{10}";
        
        if (Pattern.matches(pat2, userInput)) {
            System.out.println("Valid Account Number Format");
        }
        else { 
            System.out.println("Invalid Account Number Format");
        }

    }
}
