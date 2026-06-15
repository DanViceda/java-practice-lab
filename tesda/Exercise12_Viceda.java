/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesda;
/**
 *
 * @author danvicedaa
 * 
 *
 * 
 */
import java.util.Scanner;
public class Exercise12_Viceda {
    static Scanner input = new Scanner(System.in);
    
    // 1
    static boolean isEven(int numOne) {      
        boolean solution = (numOne % 2 == 0);
        return solution;  
    }
    static boolean isOdd(int numOne){
        boolean solution = (numOne % 2 == 1);
        return solution;
    }
    
    // 2
    static void printName(String name){
        for(int i = 0; i < 50; i++){
            System.out.print(name + " ");
        }
        System.out.println();
    }
    
    // 3
    static double getSqrt(double numOne){
        double result = Math.sqrt(numOne);
        return result;
    }
    
    // 4
    static double getPower(double base, double exponent){
        double result = Math.pow(base, exponent);
        return result;
    }
    
    // 5
    static void printRandom(){
        int result = (int)(Math.random() * 100) + 1;
        System.out.println("Random Number: " + result);
    }
    
    // 6
    static double getCircleArea(double radius){
        double result = Math.PI * radius * radius;
        return result;
    }
    
    // 7
    static boolean isVoter(int age){
        boolean result = (age >= 18);
        return result;
    }
    
    // 8
    static int getLength(String word){
        int result = word.length();
        return result;
    }
    
    // 9
    static void printReverse(String word){
        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
    
    // 10
    static void printInfo(String fullName, int age){
        System.out.println("Full Name : " + fullName);
        System.out.println("Age       : " + age);
    }
    
    
    public static void main(String[] args) {
        
        // 1
        System.out.println("===== ODD OR EVEN =====");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.nextLine();
        
        if(isEven(number)){
            System.out.println(number + " is an even number!");
        } else if (isOdd(number)){
            System.out.println(number + " is an odd number!");
        } else {
            System.out.println("Invalid Number!");
        }
        
        // 2
        System.out.println("\n===== PRINT 50 NAMES =====");
        System.out.print("Enter your name: ");
        String name1 = input.nextLine();
        printName(name1);
        
        // 3
        System.out.println("\n===== GET SQRT =====");
        System.out.print("Enter a number: ");
        double num1 = input.nextDouble();
        System.out.println("Square Root: " + getSqrt(num1));
        
        // 4
        System.out.println("\n===== GET POWER =====");
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();
        System.out.println("Result: " + getPower(base, exponent));
        
        // 5
        System.out.println("\n===== RANDOM NUMBER =====");
        printRandom();
        
        // 6
        System.out.println("\n===== AREA OF CIRCLE =====");
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.printf("Area: %.2f\n", getCircleArea(radius));
        
        // 7
        System.out.println("\n===== VOTER CHECK =====");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        
        if(isVoter(age)){
            System.out.println("You are a voter!");
        } else {
            System.out.println("You are not a voter!");
        }
        
        // 8
        System.out.println("\n===== WORD LENGTH =====");
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        System.out.println("Length: " + getLength(word));
        
        // 9
        System.out.println("\n===== REVERSE WORD =====");
        System.out.print("Enter a word: ");
        String word2 = input.nextLine();
        System.out.print("Reversed: ");
        printReverse(word2);
        
        // 10
        System.out.println("\n===== FULL NAME AND AGE =====");
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.print("Enter your age: ");
        int age2 = input.nextInt();
        input.nextLine();
        System.out.println("");
        printInfo(fullName, age2);

    }
}