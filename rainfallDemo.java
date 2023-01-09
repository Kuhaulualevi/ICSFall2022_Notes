/*
 * @Author: Levi Kuhaulua
 * @Date: 11/10/2022
 * 
 * Assingment: Rainfall
 * 
 * Algorithm: 
 * Create a class with Rainfall that creates an array with the amount of rainfall for each month of an island
 * - Within the class find the month with the highest amount of rainfall
 * - find the month with the lowest amount of rainfall
 * - Get the total amount of rainfall
 * - get the average amount of rainfall
 * - get the amount of rainfall at a specific month 
 * Create a demo that then finds and uses these methods 
 */
import java.util.*; 
import classes.*; 
public class rainfallDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        int userChoice; // user's choice for which month's rainfall they want to view. 
        double[] oahuRain = {4.64, 3.42, 5.37, 3.31, 2.93, 2.48, 3.17, 2.81, 3.07, 4.03, 5.31, 5.37}; // amount of rainfall for each month
        Rainfall Oahu = new Rainfall(oahuRain); // creating an object, Oahu, that has the amount of rain within oahuRain

        // Total amount of rain
        System.out.println("Total: " + Oahu.getTotRainfall());
        // Average amount of rain
        System.out.printf("Average: %.2f\n", Oahu.getAvgRainfall());
        // Amount at a specific point
        System.out.println("Which month do you want to view the rainfall");
        userChoice = keyboard.nextInt(); 
        System.out.println("Amount of rainfall at this month: " + Oahu.getRainAt(userChoice));
        // Output month with highest amount of rainfall
        System.out.println("Month with highest rainfall: " + Oahu.getHighestMonth());
        // Output month with lowest amount of rainfall
        System.out.println("Month with lowest rainfall: " + Oahu.getLowestMonth());

   
    }
}
