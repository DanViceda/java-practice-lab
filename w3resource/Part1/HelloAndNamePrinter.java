/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3resource.Part1;

/**
 *
 * @author danvicedaa
 */
import java.util.Scanner;

public class HelloAndNamePrinter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("===== EXERCISE 1: HELLO AND NAME PRINTER\n");
        
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.println();
        System.out.println("Hello\n" + firstName + " " + lastName );
    }
}
