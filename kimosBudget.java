/*
 * @Author: Levi Kuhaulua
 * @Date: 10/6/2022
 * 
 * Algorithm: 
 * Ask user for their budget. 
 * Have user input expenses (one at a time) until they exit
 *  - To Exit program, user should input a negative number. 
 * Find the left over amount
 * Report if user is over budget or under budget
 */

import java.util.*; 

public class kimosBudget {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // user input 

        double budget, totalExpenses, expenseAmt; // variables for user's budget, the total amount of expenses and the amount for each expense
        budget = getBudget(); 
        expenseAmt = 1; // to make the while statement true 
        totalExpenses = 0.0; // Accumulator

        while (expenseAmt > 0) {
            expenseAmt = getExpenses(); 
            if (expenseAmt < 0) { // sets expense amount to 0 if user inputted a negative (to exit program)
                expenseAmt = 0;
            }
            totalExpenses = totalExpenses + expenseAmt; 
        }

        checkBudget(budget, totalExpenses);
        
    }

    /**
     * getExpenses - asks user to input expenses for the month. 
     * @return expenses
     */
    public static double getExpenses() {
        Scanner keyboard = new Scanner(System.in);
        double expense; 
        expense = 0; // make while condition true 
        while (expense == 0) { 
            System.out.println("Enter expenses");
            String input = keyboard.nextLine(); 
            try { // check if user entered a valid number else they exited program
                expense = Double.valueOf(input); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please enter an expense");
                expense = 0; 
            }
        }
        return expense; // returns the expense
    }
    /**
     * getBudget - ask user for their budgeting amount 
     * @return budget 
     */
    public static int getBudget() {
        Scanner keyboard = new Scanner (System.in); 
        int budget = -1; // make while condition true
        while(budget <= 0) { 
            System.out.println("What is your budget? ");
            String input = keyboard.nextLine(); 
            try { // check to see if user inputted a valid budget amount
                budget = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount, please enter a valid integer.");
                budget = -1;
            }
        }

        return budget;
    }

    /**
     * checkBudget - will check if the user is over or under their budget. 
     * @param budget
     * @param totalExpenses
     */
    public static void checkBudget(double budget, double totalExpenses) {
        double result = budget - totalExpenses; 
        
        if (result < 0) { // if result is negative then user is over budget
            System.out.printf("You are %.2f OVER budget.", result);        
        } 
        else { // else result is positive and therefore user is under budget
            System.out.printf("You are %.2f UNDER budget.", result);
        }
    } 
}
