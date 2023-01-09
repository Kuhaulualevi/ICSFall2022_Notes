package classes;

public class Dog extends Pet1{
    private String breed; 
    private double tailLen; 

    public Dog(String n, double h, String o, String b, double tl) {
        super(n, h, o);
        breed = b; 
        tailLen = tl; 
    }

    /**
     * setBreed - sets the breed attribute of the dog to the argument
     * @param breed - the breed of the dog
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * setTailLen - sets the tail length attribute to the argument
     * @param tailLen - the tail length of the dog
     */
    public void setTailLen(double tailLen) {
        this.tailLen = tailLen;
    }

    /**
     * getBreed - gets the breed of the dog and returns it. 
     * @return breed - the breed of the dog
     */
    public String getBreed() {
        return breed;
    }

    /**
     * getTailLen - gets the tail length of the dog and returns it. 
     * @return tailLen - the tail length of the dog
     */
    public double getTailLen() {
        return tailLen;
    }

    @Override
    /**
     * toString - will return the dog's info in a nicely formatted way
     * return - a statement on the dog's info including their name, height, and who their owner is. 
     */
    public String toString() {
        return "Name: " + super.getName() + "\nHeight: " 
        + super.getHeight() + "\nOwner: " + super.getOwner()
        + "\nBreed: " + breed + "\nTail Length: " + tailLen; 
    }
}
