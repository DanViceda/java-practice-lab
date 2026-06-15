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

public class Exercise7_1_Viceda {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("===== EXERCISE 7.1 ; SUMMATION OF 1 TO N ===== \n");
        
        //clue based on the example: variable = i, n, sum 
        int n = 8; // int n = nextInt(); user based
        int sum = 0; // add i + sum
        
        for (int i = 1; i <= n; i++){           
            
            sum += i;      
            System.out.println("i = " + i + ", sum = " + sum);
        }
        System.out.println("\nFinal Sum: " + sum);
    }
}
