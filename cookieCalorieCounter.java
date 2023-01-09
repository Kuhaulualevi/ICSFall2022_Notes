/*
 * @author: Levi Kuhaulua
 * @date: 9/19/2022
 * Assignment: Cookie Calorie Counter
 * 
 * Algorithm 
 * Ask user for the type of cookie they have eaten (Poi, Haupia, Ube)
 * Ask how many cookies they have eaten 
 * Input validation for cookies 
 * Output the amount of calories consumed
 */


import java.util.*;
public class cookieCalorieCounter {
    public static void main(String[] args) {
        
        // User input 
        Scanner keyboard = new Scanner(System.in); 

        //user's choice of cookie and amt eaten
        int userChoice, cookieAmt; 
        
        // Setting up variables for each calorie for cookie 
        int poiCalorie, haupiaCalorie, ubeCalorie; 


        // User input for type of cookie & amt eaten plus input validation for integers

        System.out.println("What kind of cookie have you eaten?"
            + " 1 for Poi, 2 for Haupia, 3 for Ube, and 4 to exit. ");
        
        
        while(!keyboard.hasNextInt()) {
            System.out.println("Please type in an integer: ");
            keyboard.nextLine(); 
        }

        userChoice = keyboard.nextInt(); 

        while(userChoice > 4 || userChoice < 0) {
            System.out.println("That number is out of the range. \n"
             + "Please select 1 for Poi, 2 for Haupia, 3 for Ube, or 4 to exit.");
            userChoice = keyboard.nextInt(); 
        }


        if (userChoice == 4) {
            System.out.println("Looks like you didn't eat any cookies. Pretty healthy eater.");
        } else {
           
            System.out.println("How many of that cookie have you eaten? "); 

            while(!keyboard.hasNextInt()) {
                System.out.println("Please type in an integer: "); 
                keyboard.nextLine(); 
            }

            cookieAmt = keyboard.nextInt(); 
        
            while (cookieAmt < 0) {
                System.out.println("Please type in a positive integer: "); 
                cookieAmt = keyboard.nextInt(); 
            }

            // Cookie Calorie Counter 

            if (userChoice == 1) {
                poiCalorie = cookieAmt * 40; 
                System.out.println("Calories consumed: " + String.valueOf(poiCalorie)); 
            } else if (userChoice == 2) {
                haupiaCalorie = cookieAmt * 50; 
                System.out.println("Calories consumed: " + String.valueOf(haupiaCalorie)); 
            } else if (userChoice == 3) {
                ubeCalorie = cookieAmt * 65;
                System.out.println("Calories consumed: " + String.valueOf(ubeCalorie));  
            } 
        }

    }
}
