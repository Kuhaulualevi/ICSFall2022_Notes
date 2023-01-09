/*
 * Program Description
 * To qualify for a loan: 
 *  - User has to be on job for at least 5 years
 *  - User has to be making more than 50,000
 * 
 */

import java.util.*; 

public class loanProgram {
    public static void main(String[] args) {
        int beenOnJob = beenWorking(); 
        double salary = askSalary(); 

        qualifyForLoan(beenOnJob, salary); 
    }

    public static int beenWorking() {
        Scanner keyboard = new Scanner(System.in); // user input 

        int beenOnJob; // see how long user has been on the job 
        System.out.println("How many years have you been working: ");
        // ask user how long they've been working then validate that input 
        while (!keyboard.hasNextInt()) {
            System.out.println("How long have you been working for this job? ");
            keyboard.nextLine(); 
        }

        beenOnJob = keyboard.nextInt(); 

        while(beenOnJob < 0) {
            System.out.println("Please enter a valid input: ");
            beenOnJob = keyboard.nextInt(); 
        }

        return beenOnJob; //return the years they've been working
    }

    public static double askSalary() {
        Scanner keyboard = new Scanner(System.in); 
        double salary; 
        System.out.println("Please input your annual salary: ");
        
        // ask user for salary and validate their input 
        while(!keyboard.hasNextDouble()) {
            System.out.println("Please input a number: ");
            keyboard.nextLine(); 
        }

        salary = keyboard.nextDouble(); 

        while(salary < 0) {
            System.out.println("Please input a valid number: ");
            salary = keyboard.nextDouble(); 
        }


        return salary; // return the user's salary
    }

    public static void qualifyForLoan(int workedForJob, double salary) {
        // check to see if the years they've been on job and salary satisfy requirements to qualify for loan, else they don't qualify. 
        if (workedForJob >= 5 && salary > 50000) {
            System.out.println("Great job you qualify for the loan! ");
        } else {
            System.out.println("Unfortunately you don't qualify for the loan");
        }
    }
}
