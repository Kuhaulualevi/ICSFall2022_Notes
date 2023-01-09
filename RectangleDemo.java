import classes.*;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle livingRoom = new Rectangle(); 
        livingRoom.setLength(12);
        livingRoom.setWidth(10);

        System.out.println("Length: " + livingRoom.getLength() + " Width: " + livingRoom.getWidth() + " Area: " + livingRoom.getArea());

        
    }
}
