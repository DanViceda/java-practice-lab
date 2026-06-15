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

public class Exercise7_3_Viceda {
        public static void main(String[] args) {
            
        Scanner sc = new Scanner (System.in);
        
        System.out.println("===== EXERCISE 7.3 ; ARITHMETIC SEQUENCE (SUM ONLY) ===== \n");
        
        System.out.print("Sum: ");
        
        int startNumber = 1;
        int commonDifference = 5;
        int n = 8; // int n = nextInt(); user based
        int sum = 0;
        
        for (int i = 1; i <= n; i++){ 
            System.out.print(startNumber);
           
            sum+= startNumber;
            
            if (i < n){
                System.out.print(" + ");
            }
            startNumber += commonDifference;  
 
        }
        
        System.out.println(" = " + sum);
    }
}
