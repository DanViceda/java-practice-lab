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

public class Part1_Exercise2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("===== EXERCISE 2: SUM OF TWO NUMBERS\n");
        
        System.out.print("Enter First Number: ");                
        int numOne = input.nextInt();

        System.out.print("Enter Second Number: ");          
        int numTwo = input.nextInt();
        
        int sum = numOne + numTwo;
        
        System.out.println();
        System.out.println("The sum of " + numOne + " + " + numTwo + " = " + sum);
    }
}
