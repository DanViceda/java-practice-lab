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

import java.util.Scanner;

public class Exercise4_Viceda { // Age Categorizer Exercise 4
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        if (age >= 0 && age <= 100){
            if (age >= 0 && age <= 2) {
                System.out.println("Baby");
            } else if (age >= 3 && age <= 12) {
                System.out.println("Child");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Teenager");
            } else if (age >= 20 && age <= 29) {
                System.out.println("Young Adult");
            } else if (age >= 30 && age <= 59) {
                System.out.println("Adult");
            } else if (age >= 60 && age <= 100) { // 100-120
                System.out.println("Senior");
            } 
        }else{
            System.out.println("Invalid Age, age must be greater than 0");
        }
        
    }
}
