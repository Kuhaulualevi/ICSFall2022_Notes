import java.io.File;

/*
 * @Assignment: Rectangle Method
 * Create two methods, one that takes in the length and width and return the area. 
 * The other that takes in the length and width and return the perimeter. 
 */

public class rectangleMethod {
    public static void main(String[] args) {
        int area = returnArea(5, 4); 
        System.out.println("Area equals " + area);

        double perimeter = returnPerimeter(6,4);
        System.out.printf("%.0f", perimeter);
    }

    public static int returnArea(int width, int length) {
        return length * width; 
    }

    public static double returnPerimeter(double width, double length) {
        return ((2 * width) + (2 * length));  
    }

}

