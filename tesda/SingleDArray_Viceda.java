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

public class SingleDArray_Viceda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      SINGLE DIMENSIONAL ARRAY        ");
        System.out.println("======================================\n");

        int sum = 0;
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:\n");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        System.out.println("\n---------------------------------------------------------------");

        System.out.print("Numbers Entered: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println("\n---------------------------------------------------------------");

        System.out.println("Total Sum   : " + sum);

        double average = (double) sum / numbers.length;//type casting
        System.out.println("Average     : " +  average);

        System.out.println("======================================");
    }
}