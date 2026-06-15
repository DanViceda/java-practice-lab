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
public class Exercise2_Viceda {
    public static void main (String [] args){
    
        
        int number = 59;

        boolean isEven = number % 2 == 0; // divisible by 2 and zero remainder

        System.out.println(isEven);
   
        boolean isOdd = !isEven;
        
        // convert odd to even using increment with short ternary operator  shorthand (if-else)not using if-else tho
        number += (isOdd ? 1 : 0);
        
        System.out.println(number);
        
        
        
    
    }
}
