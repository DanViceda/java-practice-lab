/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesda;

/**
 *
 * @author danvicedaa
 */

//className
public class Exercise1_Viceda {
    public static void main (String [] args){
        
        //initialize variable =  assign values;
        boolean isEnrolled = true;
        byte yearLevel = 4;
        short totalUnits = 23;
        int age = 23;
        long accountBalance = 600000000000L;
        float gpa = 1.75f;
        double piDigit = 3.1415925d; //pi digite is infinite  
        char section = 'C';
        String studentName = "Jane Doe Viceda";
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Section: " + section);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa );
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Total Subject Units: " + totalUnits);
        
        System.out.println("Pi Digit: " + piDigit + ".....................");
    }
}
