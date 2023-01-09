import classes.*;
public class petDemo {
    public static void main(String[] args) {
        Pet x = new Pet("Dennis", "Dog", 4);
        Pet y = new Pet("Fifi", "Cat", 2);

        System.out.println(x.toString()); 
        System.out.println("----------------------------------------------"); 
        System.out.println(y.toString());
    }
    
}