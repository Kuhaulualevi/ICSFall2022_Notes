/**
 * Shape
 * ------------------------------------------------------------------
 * - radius : double
 * - base : double
 * - height : double 
 * - side : double 
 * -------------------------------------------------------------------
 * + Shape() 
 * + Shape(r : double, b : double, h : double, s : double)
 * + circleArea(r : double) : double 
 * + parallelogramArea(b : double, h : double) : double 
 * + triangleArea(b : double, h : double) : double
 * + squareArea(s : double) : double 
 */
package classes;

public class Shape {
    private double radius, base, height, side; 

    /**
     * Shape() is a no argument constructor that will assign all the variables to 0 
     */
    public Shape() {
        radius = base = height = side = 0.0; // setting the variables to 0.0
    }

    /**
     * Shape() - constructor that takes in the arguments for radius, base, height, and side, and then set the variables to those arguments. 
     * @param r - the radius of the object
     * @param b - the base of the object 
     * @param h - the height of the object
     * @param s - the length of the side of the object
     */
    public Shape(double r, double b, double h, double s) {
        radius = r; 
        base = b; 
        height = h; 
        side = s; 
    }

    /**
     * circleArea() - calculates the area of a circle and returns that value
     * @param r
     * @return the area of a circle 
     */
    public static double circleArea(double r) {
        final double PI = 3.14; 
        return (r * r) * PI; // Area of a circle
    }

    /**
     * parallelogramArea - will calculate the area of a parallelogram and return the area
     * @param b - the length of the base of the object
     * @param h - the height of the object
     * @return the area of the parallelogram 
     */
    public static double parallelogramArea(double b, double h) {
        return b * h; // Area of a parallelogram 
    }

    /**
     * triangleArea - calculate the area of a triangle and return the area
     * @param b - length of the base of the object
     * @param h - the height of the object 
     * @return the area of the triangle
     */
    public static double triangleArea(double b, double h) {
        return 0.5 * (b * h); // area of a triangle
    }

    /**
     * squareArea - calculate the area of a square and return the area
     * @param s - the length of the side of a square
     * @return the area of the square
     */
    public static double squareArea(double s) {
        return s * s; // area of a square
    }
}
