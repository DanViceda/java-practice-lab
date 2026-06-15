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
public class Exercise6_2_Viceda {
    public static void main(String[] args) {
        System.out.println("====== MULTIPLICATION TABLE OF 2 ===== \n");
        
        
        for (int numOne = 1; numOne <= 10; numOne++){
            
            for(int numTwo = 15; numTwo <= 15; numTwo++){
                
                int result = numOne * numTwo;
                
                System.out.println(numOne + " * " + numTwo + " = "+ result);
            }
        }
    }
}
