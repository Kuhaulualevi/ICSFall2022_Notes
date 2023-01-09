package classes; 
/*
 *ProductItem
 ------------------------------- ------------------------------
 * - itemSum
 * - unitAmt
 * - price
 --------------------------------------------------------------
 * + ProductItem()
 * + ProductItem(sumItem : String, amt : int, cost : double)
 * + setPrice(cost : double) : void
 * + setAmt(quantity: int) : void
 * + setSummary(dscr : String) : void
 * + getPrice() : double
 * + getAmt() : int
 * + getSummary() : String
 * + toString() : String
 --------------------------------------------------------------
 */



public class ProductItem {
    private double price;  // allows for decimals 
    private String itemSum; // quick description of the item
    private int unitAmt;  // how much is in stock

    /**
     * ProductItem - No arg constructor that sets the price and unit amount to 0 and then set the item 
     * description to "no description"
     */
    public ProductItem() {
        price = 0.0; 
        itemSum = "No Description";
        unitAmt = 0; 
    }

    /**
     * ProductItem - constructor that takes in the arguments for item summary, amount in stock, and cost of item
     * then it will set the variables price, itemSum, and unitAmt as their respective arguments. 
     * @param sumItem
     * @param amt
     * @param cost
     */
    public ProductItem(String sumItem, int amt, double cost) {
        price = cost; 
        itemSum = sumItem; 
        unitAmt = amt; 
    }

    /**
     * setPrice - takes in a parameter: cost, and then sets price as that parameter.
     * @param cost
     */
    public void setPrice(double cost) {
        price = cost; 
    }

    /**
     * setAmt - takes in parameter: quantity, and then sets unitAmt as that parameter. 
     * @param quantity
     */
    public void setAmt(int quantity) {
        unitAmt = quantity;
    }

    /**
     * setSummary - takes in parameter: dscr, and then sets itemSum as that parameter. 
     * @param dscr
     */
    public void setSummary(String dscr) {
        itemSum = dscr; 
    }

    /**
     * getPrice - will return the value of the price variable
     * @return price - the price of the item
     */
    public double getPrice() {
        return price; 
    }

    /**
     * getAmt - will return the amount of stock for that particular item.
     * @return unitAmt - the stock of the item
     */
    public int getAmt() {
        return unitAmt;
    }

    /**
     * getSummary - will return the description of the item.
     * @return itemSum - the quick summary of the item
     */
    public String getSummary() {
        return itemSum;
    }

    /**
     * toString - will return the important facts about the item in a nicely formatted way. 
     * @return a nicely formatted way of the item's description, stock, and cost
     */
    public String toString() {
        return "Item Description: " + itemSum + "\nQuantity: " + unitAmt + "\nPrice: " + price;
    }

}

