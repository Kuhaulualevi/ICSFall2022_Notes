
import java.util.*;  
import classes.Patient; 
public class PatientDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        // variabls for Patient info. 
        String name, address, telNum, email, bDate; 
        String patientID, insuranceName, insuranceNum;
        final int NUMOFPATIENTS = 2;  
        // array to hold patient info. 
        Object[] patients = new Object[NUMOFPATIENTS];  

        System.out.println("Welcome, input Patient information");
        // Getting Patient information, then creating objects for them. 
        for(int i = 0; i <= NUMOFPATIENTS; i++) {
            System.out.println("Name: ");
            name = keyboard.nextLine(); 
            System.out.println("Address: ");
            address = keyboard.nextLine(); 
            System.out.println("Telephone Number: \nExample with Format: (808)397-0447");
            telNum = keyboard.nextLine(); 
            // Input validation for Patient's phone number
            while(!Patient.validateTelNum(telNum)) {
                System.out.println("Invalid Entry. Please enter again.");
                telNum = keyboard.nextLine(); 
            }
            System.out.println("Email: ");
            email = keyboard.nextLine(); 
            // Input validation for Patient's email
            while(!Patient.validateEmail(email)) {
                System.out.println("Invalid Entry. Please enter email again."); 
                email = keyboard.nextLine(); 
            }
            System.out.println("Date of Birth: \nExample with Format: 01/19/2001");
            bDate = keyboard.nextLine(); 
            // Input validation for Patient's Date of Birth
            while(!Patient.validateBDate(bDate)) {
                System.out.println("Invalid Entry, please input Date of Birth again.");
                bDate = keyboard.nextLine(); 
            }
            // Getting Patient info: ID, insurance, and insurance number. 
            System.out.println("Patient ID Number: \nExample with Format:@123456");
            patientID = keyboard.nextLine(); 
            // Input validation for Patient ID
            while(!Patient.validateID(patientID)) {
                System.out.println("Invalid entry, please enter ID again.");
                patientID = keyboard.nextLine(); 
            }

            System.out.println("Insurance: ");
            insuranceName = keyboard.nextLine(); 

            System.out.println("Insurance Number: \nExample with Format: 1234-5678");
            insuranceNum = keyboard.nextLine(); 
            while(!Patient.validateInsuranceNum(insuranceNum)) {
                System.out.println("Invalid entry, please enter Insurance Number again.");
                insuranceNum = keyboard.nextLine(); 
            }

            patients[i] = new Patient(name, address, telNum, email, bDate, patientID, insuranceName, insuranceNum);
        }

        // output the patient's information
        System.out.println("Outputting Patient Info...");
        for(int i = 0; i < patients.length; i++) {
            System.out.println("Patient " + (i + 1) + " Information: ");
            System.out.println(patients[i].toString());
        }

            
        
    }

    
    
    
}
