/*
 * Pet
 * -----------------------------------------------
 * - name : String
 * - type : String
 * - age : int
 * -----------------------------------------------
 * + Pet(n : String, t : String, a : int) 
 * + Pet() 
 * + setName(n : String) : void
 * + setType(t : String) : void
 * + setAge(a : String) : void
 * + getName() : String
 * + getType() : String
 * + getAge() : int
 * + toString() : String
 * -----------------------------------------------
 */
package classes;
public class Pet {
    private String name, type; 
    private int age; 

    public Pet() {
        name = "unknown"; 
        type = "unknown"; 
        age = 0;  
    }

    public Pet(String n, String t, int a) {
        name = n;
        type = t; 
        age = a; 
    }

    public void setName(String n) {
        name = n; 
    }

    public void setType(String t) {
        type = t;
    }

    public void setAge(int a) {
        age = a; 
    }

    public String getName() {
        return name; 
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nAge: " + age; 
    }

}
