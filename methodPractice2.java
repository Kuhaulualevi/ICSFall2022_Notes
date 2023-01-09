import java.util.*;
import java.io.*;

public class methodPractice2 {
    public static void main(String[] args) {
        double total = sumTwo(3, 5);
        System.out.println("Total: " + total);

        double hours = askHours(); 
        double hourlyRate = askHourlyRate(); 
        double grossPay = grossPay(hours, hourlyRate);
        System.out.println(grossPay); 
        
    }

    public static double sumTwo(double num1, double num2) {
        double result;
        result = num1 + num2;
        return result;
    }

    public static double askHours() {
        double hoursWorked;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter hours worked: ");
        hoursWorked = keyboard.nextDouble();

        return hoursWorked; 

    }

    public static double askHourlyRate() {
        double hourlyRate;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter rate: "); 
        hourlyRate = keyboard.nextDouble(); 
        return hourlyRate; 
    }

    public static double grossPay (double hours, double hourlyRate) {
        double grossPay = hours * hourlyRate; 
        return grossPay; 
    }
}
