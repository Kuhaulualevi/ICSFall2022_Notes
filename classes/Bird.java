package classes;

public class Bird extends Pet1{
    private String species; 
    private double wingspan; 

    public Bird(String n, double h, String o, String s, double ws) {
        super(n, h, o); 
        species = s; 
        wingspan = ws; 
    }
}
