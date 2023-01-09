package classes;
import java.util.regex.*; 
/*
 * Patient
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * - patientID : String
 * - insuranceName : String
 * - insuranceNum : String
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
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
public class Patient extends Person{
    private String patientID, insuranceName, insuranceNum; 

    /**
     * Patient() - no arg constructor that will set the variables to a random value
     */
    public Patient() {
        super(); 
        patientID = insuranceName = insuranceNum = "Unknown";
    }

    /**
     * Patient() - constructor with takes in the arguments for the person's info and then set them to their respective variables. 
     * @param name - person's name
     * @param address - person's address
     * @param telNum - person's telephone number
     * @param email - person's email
     * @param bDate - person's date of birth
     * @param patientID - Patient's Identification Number
     * @param insuranceName - name of person's insurance
     * @param insuranceNum - name of person's insurance number
     */
    public Patient(String name, String address, String telNum, String email, String bDate, String patientID, String insuranceName, String insuranceNum) {
        super(name, address, telNum, email, bDate); 
        this.patientID = patientID; 
        this.insuranceName = insuranceName; 
        this.insuranceNum = insuranceNum;
    }

    /**
     * setPatientID - set a patient's identification number
     * @param patientID - Patient's ID number (starts with @) 
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    /**
     * setInsuranceName - set a person's insurance
     * @param insuranceName - name of person's insurance
     */
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    /**
     * setInsuranceNum - set a person's insurance number for their insurance
     * @param insuranceNum - ID for person's insurance card
     */
    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }

    /**
     * getPatientID - returns a patients ID number
     * @return patients ID 
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * getInsuranceName - returns a person's insurance 
     * @return name of person's insurance
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * getInsuranceNum - returns a person's insurance number
     * @return insurance number
     */
    public String getInsuranceNum() {
        return insuranceNum;
    }

    /**
     * validateID - looks at a patient's ID number and validates it
     * @param patientID - their ID starting with @ followed by 6 digits
     * @return true or false if ID is valid. 
     */
    public static boolean validateID(String patientID) {
        boolean validated = false; 
        if(Pattern.matches("@[0-9]{6}", patientID)) {
            validated = true; 
        }
        return validated; 
    }

    /**
     * validateInsuranceNum - checks to see if insurance number entered is a valid entry
     * @param insuranceNum - insurance number for person's insurance
     * @return true or false if insurance number is valid
     */
    public static boolean validateInsuranceNum(String insuranceNum) {
        boolean validated = false; 
        if(Pattern.matches("[0-9]{4}-[0-9]{4}", insuranceNum)) {
            validated = true; 
        }
        return validated; 
    }

    /**
     * toString() - outputs a patients information like their ID, insurance, and number including their personal info. 
     * @return Patient's information. 
     */
    @Override
    public String toString() {
        return super.toString() + "\nPatient ID: " + patientID
        + "\nInsurance" + insuranceName + "\nInsurance Number" + insuranceNum; 
    }
}
