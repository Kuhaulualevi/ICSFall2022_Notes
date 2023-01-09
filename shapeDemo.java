/*
 * @Author: Levi Kuhaulua
 * @Date: 11/16/2022
 * Assignment: Shape Calculator 
 * 
 * Algorithm: 
 * Create a class called shape that has the following static methods
 * - calculate the area of a circle 
 * - calculate the area of a parallelogram
 * - calculate the area of a triangle 
 * - calculate the area of a square 
 * Create a demo file that will display a menu to use those options or to exit the program 
 */
import java.util.*;
import classes.Shape;
public class shapeDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        double areaCircle, areaParallelogram, areaTriangle, areaSquare; // area of the respective shapes
        double radius, base, height, side; 
        int userChoice; // user's option for the menu

        // menu screen
        System.out.println("Shape Calculator: " 
        + "\n********************************" 
        + "\n1) Calculate Area of a Circle"
        + "\n2) Calculate Area of a Parallelogram" 
        + "\n3) Calculate Area of a Triangle" 
        + "\n4) Calculate Area of a Square" 
        + "\n5) Exit Program");

        userChoice = validateChoice(); // selecting the user's choice
       
        // keep program going until user decides to exit. 
        while (userChoice != 5) {
            if (userChoice == 1) {
                System.out.println("What is the radius of the Circle"); 
                radius = validateDimension(); // validate the user's input for the radius 
                areaCircle = Shape.circleArea(radius); 
                System.out.format("Area: %.2f\n", areaCircle); // print out the area
                userChoice = validateChoice(); // select another option 
            } 
            else if (userChoice == 2) {
                System.out.println("What is the base of the Parallelogram?");
                base = validateDimension(); // validate the user's input for the base
                System.out.println("What is the height of the Parallelogram?");
                height = validateDimension(); // validate the user's input for the height
                areaParallelogram = Shape.parallelogramArea(base, height); 
                System.out.format("Area: %.2f\n", areaParallelogram); // print out the area
                userChoice = validateChoice(); // select another option 
            } 
            else if (userChoice == 3) {
                System.out.println("What is the base of the Triangle?");
                base = validateDimension(); 
                System.out.println("What is the height of the Triangle");
                height = validateDimension();
                areaTriangle = Shape.triangleArea(base, height);
                System.out.format("Area: %.2f\n", areaTriangle);
                userChoice = validateChoice();
            }
            else if (userChoice == 4) {
                System.out.println("What is the length of the side of the Square?");
                side = validateDimension();  // validate the user's input for the side
                areaSquare = Shape.squareArea(side); 
                System.out.format("Area: %.2f\n", areaSquare);
                userChoice = validateChoice();
            }
        }
        // when user selects to exit the program. 
        System.out.println("Thank you for using the program!");
        System.exit(0); 
    }

    /**
     * validateChoice - will check the user's choice for the calculations and then return the user's choice
     * @return choice - the user's choice for the Shape calculator options
     */
    public static int validateChoice() {
        Scanner keyboard = new Scanner(System.in); 
        int choice = -1; // make while statement true  
        // will check the user's choice for a valid option in the program 
        while (choice <= 0 || choice > 5) {
            System.out.println("Please select an option from 1 through 5");
            String input = keyboard.nextLine(); 
            try {
                choice = Integer.valueOf(input); 
            } catch(NumberFormatException e){
                choice = -1; // repeat the loop until condition is met 
            }
        }
        return choice; 
    }

    /**
     * validateDimension - will validate the user's input for the dimension of an object.
     * @return dimension - the length of a specific dimension
     */
    public static double validateDimension() {
        Scanner keyboard = new Scanner(System.in); 
        double dimension = -1; // make the while statement true 
        // will check for a valid dimension of an object
        while(dimension <= 0) {
            String input = keyboard.nextLine(); 
            try {
                System.out.println("Dimension: ");
                dimension = Double.valueOf(input); 
            } catch (NumberFormatException e) {
                System.out.println("Please input a number: ");
                dimension = -1; // repeats loop until valid dimension is entered for object. 
            }
            
        }

        return dimension; 
    }

}
