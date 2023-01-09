/**
 *                    Pet1
 * -----------------------------------------------------------------
 * - name : String
 * - height : double 
 * - owner : String
 * -----------------------------------------------------------------
 * + Pet()
 * + Pet(n : String, h : double, o : String)
 * + setName(n : String) : void
 * + setHeight(h : double) : void
 * + setOwner(o : String) : void
 * + getName() : String
 * + getHeight() : double
 * + getOwner() : String
 * + toString() : String 
 * -----------------------------------------------------------------
 *                                                      ^
 *                                                      |
 *                                                      |  
 *                                                      |
 *                                                      |
 * -------------------------------------------------------------------------------------------------------------------------------------
 * Dog                                                               \  Bird
 * -------------------------------------------------------------------------------------------------------------------------------------
 * - breed : String                                                  | - species : String
 * - tailLen : double                                                | - wingspan : double 
 * -------------------------------------------------------------------------------------------------------------------------------------
 * + Dog()                                                           | + Bird()
 * + Dog(n : String, h : double, o : String, b : String, tl : double)| + Bird(n : String, h : double, o : String, s : String, w : double)
subclass: bird, dog,
*/


package classes;

public class Pet1 {
    // private attributes 
    private String name, owner; 
    private double height; 

    /**
     * Pet1() - no arg constructor that makes the pet information unknown
     */
    public Pet1() {
        name = owner = "invalid"; 
        height = 0;
    }

    /**
     * Pet1() - Constructor that takes in arguments for name, height and owner and then set the variables to those values 
     * @param n - name of the pet
     * @param h - height of the pet
     * @param o - name of the owner of the pet
     */
    public Pet1(String n, double h, String o) {
        name = n; 
        height = h; 
        owner = o;
    }

    /**
     * setName - set the attribute, name, to n
     * @param n - name of the pet
     */
    public void setName(String n) {
        name = n; 
    }
    
    /**
     * setHeight - set the attribute, height, to h
     * @param h - height of the pet
     */
    public void setHeight(double h) {
        height = h; 
    }

    /**
     * setOwner - set the attribute, owner, to o
     * @param o - the owner of the pet 
     */
    public void setOwner(String o) {
        owner = o;
    }

    /**
     * getName - gets the name of the pet and returns it
     * @return name - the name of the pet
     */
    public String getName() {
        return name;
    }

    /**
     * getHeight - gets the height of the pet and returns it
     * @return height - the height of the pet
     */
    public double getHeight() {
        return height;
    }

    /**
     * getOwner - gets the owner of the pet and returns it
     * @return owner - the owner of the pet 
     */
    public String getOwner() {
        return owner;
    }

    /**
     * toString - will return the pets information in a nicely formatted way
     * @return - nicely formatted statement of a pet's information
     */
    public String toString() {
        return "Name: " + name + "\nHeight: " + height + "\nOwner: " + owner;
    }
}
