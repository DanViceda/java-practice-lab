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

public class Part1_Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("===== EXERCISE 4: ARITHMETIC OPERATIONS\n");
        
       // we gonna perform combination of different arithmetic operation (+, -, *, /)
       
       // Pero sa Java (at halos lahat ng programming languages/math), may sinusunod na OPERATOR PRECEDENCE. OR PRIORITY ORDER NG OPERATION
       
       /*
        1. Parentheses        ()
        2. Multiplication     *
        3. Division           /
        4. Modulus            %
        5. Addition           +
        6. Subtraction        -
       
       +- left to right
       intiger division kapag parehong whole number ()int yung sa division hindi mag rereturn ng decimal
       
       pero kung ex: 1 / 0.5 = mag rererturn ng decimal or pwede din gumamit ng (double)1 thingy para mag return din non
       */
       
       double dam = (double)1 / 2;
       
       double x = (9 + 2 - 1 / 2 * 1);
       double y = 13 - 2 + (23 - 1 / 4) * 2; 
       double z = 5 - 4 * 3;
       
       System.out.println("Result X: " + x);
       System.out.println("Result Y: " + y);
       System.out.println("Result Z: " + z);
        System.out.println(dam);
    }
}
