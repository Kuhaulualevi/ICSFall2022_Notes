/*
 * @Author: Levi Kuhaulua
 * @Date: 10/6/2022
 * 
 * Algorithm
 * Ask user for price of item
 * Ask user for discount of item
 *  - discount should be in decimal
 * Calculate the actual price 
 * Output price to user 
 */

import java.util.*;

public class sale {
    public static void main(String[] args) {

        double salesPrice, discount; // variables for calculating the costs 
        salesPrice = getPrice(); 
        discount = getDiscount(); 
        outputPrice(salesPrice, discount); 
    }   

    /**
     * getPrice - asks the user for price of product
     * @return price
     */
    public static double getPrice() {
        Scanner keyboard = new Scanner(System.in); 
        double price = -1; // sets price to -1 to make while statement true 
        while(price <= 0) { 
            System.out.println("What is the price of this product: ");
            String input = keyboard.nextLine(); 
            try { // checks if price is a valid number else keep trying. 
                price = Double.valueOf(input); 
            } catch (NumberFormatException e) {
                price = -1; 
            }
        }
        return price; // returns the price 
    }
    /**
     * getDiscount - asks the user to input the discount for the product.
     * @return discount
     */
    public static double getDiscount() {
        Scanner keyboard = new Scanner(System.in); 
        double discount = -1; // sets discount to make while statement true
        while (discount <= 0) {
            System.out.println("what is the discount of the product");
            String input = keyboard.nextLine(); 
            try { // checks to see if discount is a valid number else keep trying
                discount = Double.valueOf(input); 
            } catch (NumberFormatException e) {
                discount = -1;
            }
        }
        
        discount = discount / 100; 
        
        return discount; // returns the discount 
    }
    /**
     * outputPrice - multiplies the sales price with the discount and then output the actual price.
     * @param salesPrice
     * @param discount
     */
    public static void outputPrice(double salesPrice, double discount) {
        double finalPrice = salesPrice * discount; // calculate the final price of the product
        System.out.printf("%.2f", finalPrice); // truncate final price to two decimal points
    }
}
