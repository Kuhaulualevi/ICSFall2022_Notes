import java.util.*;
public class lunchCosts {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        double costOfLunch; 
        final int DAYSOFWEEK = 5; 
        ArrayList<Double> lunchCosts = new ArrayList<>(); 
        
        // having user input 
        for (int i = 0; i < DAYSOFWEEK; i++) {
            System.out.println("How much did you spend for lunch today? ");
            costOfLunch = keyboard.nextDouble(); 
            lunchCosts.add(costOfLunch); 
        }

        
        // output the costs (one element at a time)
        for (double costs : lunchCosts) {
            System.out.println(costs);
        }

        // sorting the costs
        Collections.sort(lunchCosts); 

        // ouput the whole costs
        System.out.println("Overview of how much you spent: ");
        System.out.println(lunchCosts);

        // totaling the costs and outputting the total. 
        double total = 0.0; // accumulator 
        for (double costs : lunchCosts) {
            total += costs; 
        }
        System.out.println("Total money spent on lunch: " + total);
    }
}
