/*
 * @Author: Levi Kuhaulua
 * @Date: 9/22/2022
 * 
 * Assignment: Test Score File Exercise
 * 
 * Algorithm: 
 * Get user input on number of test scores 
 * write test scores to a file 
 * Read & total test scores from file 
 */

import java.util.*; 
import java.io.*; 

public class testScoresFileExercise {
    public static void main(String[] args) throws IOException {
        
        //User input
        Scanner keyboard = new Scanner(System.in); 

        
        int totalTestScore = 0; // sum of all test scores, acts as accumulator 
        int testScoreAmt; // total amount of test scores 
        int testScore; // the test score of a student 

        System.out.println("How many test scores have you graded/received:");
        testScoreAmt = keyboard.nextInt(); 

        PrintWriter testScoreFile = new PrintWriter("testScore.txt");


       
        for (int i = 1; i <= testScoreAmt; i++) {
            System.out.println("How many points did this test get?");
            testScore = keyboard.nextInt(); 
            
            testScoreFile.println(testScore);
        }
        
        testScoreFile.close();
        
        File readFile = new File ("testScore.txt");
        Scanner testsRead = new Scanner (readFile); 

        while (testsRead.hasNext()) {
            testScore = testsRead.nextInt(); 
            System.out.println( "\n" + testScore);

            totalTestScore = totalTestScore + testScore;
        }

        System.out.println( "\n" + totalTestScore);
        
        testsRead.close();
        
    }
}