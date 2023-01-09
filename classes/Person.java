package classes;
import java.util.regex.*;
/*
 * Person
 * -----------------------------------------------------------------------------------------------------------------------------------
 * - name : String
 * - address : String
 * - telNum : String
 * - email : String
 * - bDate : String
 * -----------------------------------------------------------------------------------------------------------------------------------
 * + Person() 
 * + Person(name : String, address : String, telNum : String, email : String, bDate : String)
 * + setName(name : String) : void
 * + setAddress(address : String) : void
 * + setTelNum(telNum : String) : void
 * + setEmail(email : String) : void
 * + setBDate(bDate : String) : void
 * + getName() : String
 * + getAddress() : String
 * + getTelNum() : String
 * + getEmail() : String
 * + getBDate() : String
 * + validateBDate(bDate : String) : boolean
 * + validateEmail(Email : String) : boolean
 * + validateTelNum(telNum : String) : boolean
 * + toString() : String
 * --------------------------------------------------------------------------------------------------------------------------------
 *                                                  ^
 *                                                  |
 *                                                  |
 * Patient
 * ---------------------------------------------------------------------------------------------------------------------------------
 * - patientID : String
 * - insuranceName : String
 * - insuranceNum : String
 * ----------------------------------------------------------------------------------------------------------------------------------
 * + Patient()
 * + Patient(name : String, address : String, telNum : String, email : String, bDate : String, patientID : String, insuranceName : String, insuranceNum : String)
 * + setPatientID(patientID : String) : void
 * + setInsuranceName(insuranceName : String) : void
 * + setInsuranceNum(insuranceNum : String) : void
 * + getPatientID() : String
 * + getInsuranceName() : String
 * + getInsuranceNum() : String
 * + validateID(patientID : String) : boolean
 * + validateInsuranceNum(insuranceNum : String) : boolean
 * + toString() : String
 */
public class Person {
    private String name, address, telNum, email, bDate; 

    /**
     * Person - no arg constructor that creates a profile of a person 
     */
    public Person() {
        name = address = telNum = email = bDate = "unknown"; 
    }

    /**
     * Person - constructor that takes in the arguments for name, address, telephone number, email, and birth date
     * and sets those arguments to their respective variables. 
     * @param name - person's name
     * @param address - person's address
     * @param telNum - person's telephone number 
     * @param email - person's email
     * @param bDate - person's date of birth
     */
    public Person(String name, String address, String telNum, String email, String bDate) {
        this.name = name; 
        this.address = address; 
        this.telNum = telNum; 
        this.email = email; 
        this.bDate = bDate; 
    }

    /**
     * setName - allows user to set a person's name
     * @param name - person's name
     */
    public void setName(String name) {
        this.name = name; 
    }

    /**
     * setAddress - allows user to set a person's address
     * @param address - person's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * setEmail - allows user to set a person's email
     * @param email - person's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * setTelNum - allows user to set a person's telephone number
     * @param telNum - person's telephone number
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     * setBDate - allows user to set a person's date of birth
     * @param bDate
     */
    public void setBDate(String bDate) {
        this.bDate = bDate;
    }

    /**
     * getName - get name of the person and return it
     * @return returns the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * getAddresss - get name of the person's address and return it. 
     * @return returns the person's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * getEmail - get the person's email and return it. 
     * @return returns the person's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * getTelNum - get the person's telephone number and return it
     * @return returns the person's telephone number
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * getBDate - get the person's date of birth and return it. 
     * @return returns the person's date of birth.
     */
    public String getBDate() {
        return bDate;
    }

    /**
     * validateBDate - check to see if person's date of birth is a valid input
     * @param bDate - person's date of birth
     * @return if birthdate is a valid input
     */
    public static boolean validateBDate(String bDate) {
        boolean validated = false; 
        if (Pattern.matches("([0][1-9]|[1][0-2])/(0[1-9]|[1-2][0-9]|3[0-1])/(19[0-9]{2}|20[0][0-9]|20[1][0-9]|20[2][0-2])", bDate)) {
            validated = true; 
        }
        return validated;
    }

    /**
     * validateEmail - checks to see if person's email is a valid email
     * @return true/false if email is valid. 
     */
    public static boolean validateEmail(String email) {
        boolean validated = false; 
        if (Pattern.matches("[a-zA-z0-9@.]+", email)) {
            validated = true; 
        }
        return validated; 
    }

    /**
     * validateTelNum - checks to see if telephone number is valid
     * @param telNum - person's telephone number
     * @return true or false if telephone number is valid. 
     */
    public static boolean validateTelNum(String telNum) {
        boolean validated = false; 
        if (Pattern.matches("\\([1-9][0-9]{2}\\)[0-9]{3}-[0-9]{4}", telNum)) {
            validated = true; 
        }
        return validated; 
    }

    /**
     * toString() - outputs a person's information
     */
    public String toString() {
        return "Name: " + name + "\nEmail: " + email 
        + "\nTelephone Number: " + telNum + "\nDate of Birth: " + bDate
        + "\nAddress: " + address;
    }

   
}
