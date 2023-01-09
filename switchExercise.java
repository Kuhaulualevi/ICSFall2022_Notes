/*
 * @author: Levi Kuhaulua
 * @date : 9/13/2022
 * Assignment: switch statement exercies
 * 
 * Algorithm: 
 * Ask user for favorite ice cream flavor for Green tea, Cookies and Cream, chocolate
 * get their input
 * output statement on each flavor
 */

 import java.util.*; 
public class switchExercise {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in); 
         
        // Ask user for their favorite ice cream flavor 
        System.out.println("What's favorite ice cream flavor: \n" + 
        "1: Green Tea\n" + 
        "2: Cookies and Cream\n" + 
        "3: Chocolate\n");
        
        // User Input
        int favoriteChoice; 
        
        while(!keyboard.hasNextInt()) {
            System.out.println("Please type in a number corresponding with each ice cream flavor."); 
            keyboard.nextLine(); 
        }

        favoriteChoice = keyboard.nextInt(); 

        // Check user's choice (favoriteChoice) and output the appropriate statement for each choice. 
        switch (favoriteChoice) {
            
            case 1 : 
                System.out.println("I'm not really a Green Tea kind of guy."); 
            break; 

            case 2 : 
                System.out.println("I love Cookies and Cream!"); 
            break; 

            case 3 : 
                System.out.println("I like chocolate."); 
            break; 

            default: 
                System.out.println("That number doesn't correlate with the choices."); 
        }
    }
}
