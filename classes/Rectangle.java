package classes;

public class Rectangle {
    private double length; 
    private double width;


    /**
     * Rectangle() - copy constructor. 
     * @param object2 - the object that will be copied
     */
    public Rectangle(Rectangle object2) {
        length = object2.length; 
        width = object2.width;
    }

    public Rectangle() {
        length = width = 0; 
    }

    public Rectangle(double wid, double len) {
        width = wid; 
        length = len; 
    }

    /**
     * setWidth() - sets the width attribute
     * @param - wid
     */
    public void setWidth(double wid) {
        width = wid; 
    }

    /**
     * setLength() - sets the length attribute
     * @param - len
     */
    public void setLength(double len) {
        length = len;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() { 
        return width * length; 
    }

    @Override
    /**
     * toString - format information in a nice way
     * return - nicely formatted statement
     */
    public String toString() {
        return "Dimensions: \nWidth" + width + "\nLength: " + length;
    }

    /**
     * theSame - method that will check if two objects are the same/have the same content. 
     * @param object2 - the object that we're comparing to the other. 
     * @return same - if the object has the same content has the other object. 
     */
    public boolean theSame(Rectangle object2) {
        boolean same; 

        // check to see if the contents of the both objects are the same. 
        if(width == object2.width && length == object2.length) {
            same = true; 
        } else {
            same = false;
        }
        return same;
    }

    

}

