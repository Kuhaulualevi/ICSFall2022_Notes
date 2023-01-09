
/**
 * @Author: Levi Kuhaulua
 * @Date: 10/26/2022
 * 
 * Assignment: Product Item
 * 
 * Algorithm
 * Create a class named ProductItem that contains attributes item's description, units, and price. 
 * - Create a no arg constructor
 * - Create a constructor with the 3 attributes as parameters
 * - Create the setters and getters for the attributes
 * - Create a toString method to nicely ouput information
 * 
 * For program: ask user (5 times) to enter the Product's description, stock, and price
 * Output report of the list of items. 
 *  
 */

import java.util.*;
import classes.*;

public class productItemDemo {
    public static void main(String[] args) {
        

        Object one = new Object(); 
        createItem(one); 
        Object two = new Object(); 
        createItem(two); 
        Object three = new Object(); 
        createItem(three); 
        Object four = new Object(); 
        createItem(four); 
        Object five = new Object(); 
        createItem(five); 
        
            
    }

    /**
     * validateStock - will validate the user's choice for the stock of an item, and then return that value
     * @return stock - the quantity that they have in stock for that item
     */
    public static int validateStock() {
        Scanner keyboard = new Scanner(System.in);
        int stock = -1; // to make while statement true
        while (stock <= 0) {
            System.out.println("Please enter the stock of the item: ");
            String input = keyboard.nextLine();
            try {
                stock = Integer.valueOf(input); // to check if stock can be made an integer with string input
            } catch (NumberFormatException e) {
                stock = -1; // reset loop
            }
        }
        return stock; // return the stock of a product
    }

    /**
     * validatePrice - will validate the user's entry for the price of an item, and then return that value. 
     * @return cost - the price of an item
     */
    public static double validatePrice() {
        Scanner keyboard = new Scanner(System.in);
        double cost = -1; // to make validation statement true
        while (cost <= 0) {
            System.out.println("Please enter the cost of the item: ");
            String input = keyboard.nextLine();
            try {
                cost = Double.valueOf(input); // to check if cost can be made a double with the string input
            } catch (NumberFormatException e) {
                cost = -1; // reset loop
            }
        }
        return cost; // return the cost of a product
    }

    /**
     * createItem - takes in a parameter, obj, and then creates an item with the description
     * stock, and price of that item, then outputs in a nice format.
     * @param obj - takes in an object and then uses that for the class ProductItem. 
     */
    public static void createItem(Object obj) {
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Please enter the item's name: ");
        String dscrption = keyboard.nextLine(); // name of the item
        int stock = validateStock(); // for the units of inventory for the item
        double price = validatePrice(); // for the price of the item
        obj = new ProductItem(dscrption, stock, price); 
        System.out.println(obj.toString());
        System.out.println("----------------------------------------------------");
    }
}