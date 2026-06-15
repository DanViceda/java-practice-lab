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

public class Exercise7_4_Viceda {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("===== EXERCISE 7.4 ; ARITHMETIC SEQUENCE (SUM AND PRODUCT) ===== \n");
        
        int startNumber = 1;
        int commonDifference = 5;
        int n = 8; // int n = nextInt(); user based
        int sum = 0;
        long product = 1;
        
        
        System.out.print("Sum: ");
        // SUM LOOP
        for (int i = 1; i <= n; i++){
            System.out.print(startNumber);
            
            sum += startNumber;
            
            if (i < n){
                System.out.print(" + ");
            }
            
            startNumber += commonDifference;
            

        }
        
        System.out.println(" = " + sum);
        
        // Reset startNumber back to 1 before product loop kasi nag sstay sya sa output ng sum sa loop 55
        startNumber = 1;
        
        System.out.println();
        System.out.print("Product: ");
        // PRODUCT LOOP
        for (int j =1; j <= n; j++){
            System.out.print(startNumber);
            
            if (j < n){
                System.out.print(" * ");
            }
                        
            product *= startNumber;
            
            startNumber += commonDifference;
        }
        
        System.out.println(" = " + product);    
    }
}