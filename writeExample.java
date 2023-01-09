import java.util.*; 
import java.io.*; // must have for file input and/or output

public class writeExample {
   
    public static void main(String[] args) throws IOException // always have to put that in header (throws IOException)
    {
        
        Scanner keyboard = new Scanner(System.in); 
        PrintWriter outputFile = new PrintWriter("friends.txt");
        outputFile.println("Janna");
        outputFile.println("Clarissa");
        outputFile.println("Peter"); 
        System.out.println("Writing to File. ");
        outputFile.close(); 
    
    }
}
