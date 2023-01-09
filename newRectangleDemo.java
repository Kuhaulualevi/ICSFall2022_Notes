import classes.Rectangle;
public class newRectangleDemo {
    public static void main(String[] args) {
        Rectangle livingRoom = new Rectangle();
        livingRoom.setLength(12);
        livingRoom.setWidth(10);

        // copy constructor
        Rectangle kitchen = new Rectangle(livingRoom);

        // to string methods
        System.out.println(livingRoom.toString());
        System.out.println(kitchen.toString());

        // check to see if it's the same as another object
        System.out.println(kitchen.theSame(livingRoom)); 


    }
}
