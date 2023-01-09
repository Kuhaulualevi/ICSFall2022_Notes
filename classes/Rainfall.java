/**
 *             Rainfall
 * ---------------------------------
 * - rain : double[]
 * ---------------------------------
 * + Rainfall(r: double[])
 * + getTotRainfall() : double
 * + getAvgRainfall() : double 
 * + getHighestMonth() : int 
 * + getLowestMonth() : int
 * + getRainAt(e : int) : double 
 */
package classes; 
public class Rainfall {

   private double[] rain; 

   /**
    * Rainfall - Constructor that takes in the argument, double[] r, and sets the rain array to the contents of r. 
    * @param r a double array that holds the rainfall for each month of the island
    */
   public Rainfall(double[] r) {
        rain = new double[r.length];
        for (int index = 0; index < r.length; index++) {
            rain[index] = r[index]; 
        }
   }
   /**
    * getTotRainfall - will get the total amount of rainfall for an island and return it. 
    * @return total - the total amount of rain fall for the island
    */
   public double getTotRainfall() {
        double total = 0.0; // accumulator 
        for (int i = 0; i < rain.length; i++) {
            total += rain[i];
        }
        return total; 
   }
   /**
    * getAvgRainfall - will calculate the average rainfall for the island
    * @return average which is the total amount of rainfall divided by the length of the array
    */
   public double getAvgRainfall() {
        double total = 0.0; //accumulator
        for (int i = 0; i < rain.length; i++) {
            total += rain[i]; 
        }
        return total / rain.length; 
   }

   /**
    * getHighestMonth - determine which month has the highest amount of rain fall and return it
    * @return highestRainfall + 1 which is the month that contains the highest rainfall for the island
    */
   public int getHighestMonth() {
        int highestRainfall = 0; // setting the first month to be the highest
        // checks to see which month has the most amount of rainfall 
        for(int i = 0; i < rain.length; i++) { 
            if (rain[highestRainfall] < rain[i]) {
                highestRainfall = i; 
            }
        }

        return highestRainfall + 1; // the month that has the highest rainfall
   }

   /**
    * getLowestMonth - determine which month has the highest amount of rain fall and return it. 
    * @return lowestRainfall + 1 which is the month that contains the lowest amount of rainfall for the island
    */
   public int getLowestMonth() {
        int lowestRainfall = 0; //setting the first month to be the lowest rain fall amount 
        // check to see which month has the lowest amount of rainfall
        for (int i = 0; i < rain.length; i++) {
            if (rain[lowestRainfall] > rain[i]) {
                lowestRainfall = i; 
            }
        }
        return lowestRainfall + 1; // the month that has the lowest amount of rainfall. 
   }

   /**
    * getRainAt - will get the rainfall at a specific month
    * @param e - the month that we want to find the rainfall. 
    * @return rain[e] which is the amount of rainfall at that specific month. 
    */
   public double getRainAt(int e) {
        return rain[e]; 
   }
}
