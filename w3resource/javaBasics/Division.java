/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3resource.javaBasics;

/**
 *
 * @author danvicedaa
 */
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("===== EXERCISE 3: DIVISION OF TWO NUMBERS\n");
        
        System.out.print("Enter First Number: ");
        double numOne = input.nextDouble();

        System.out.print("Enter Second Number: ");        
        double numTwo = input.nextDouble();
        
        double division = numOne / numTwo;
        System.out.println("\n The division of " + numOne + " / " +  numTwo + " = " + division);
        
    }
    
}
