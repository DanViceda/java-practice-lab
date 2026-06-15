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

public class Exercise6_1_Viceda {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //for loop
        System.out.println("===== MULTIPLICATION TABLE OF 1 ===== \n");
        
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        
        for (int i = 1; i <= 10; i++){
            int result = (number * i);
            
            System.out.println( number + " * " + i + " = " + result) ;
        }
    }
}
