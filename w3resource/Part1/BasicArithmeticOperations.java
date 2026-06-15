
package w3resource.Part1;

import java.util.Scanner;

public class BasicArithmeticOperations {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        clearScreen();
        System.out.println("=============================");
        System.out.println("Basic Arithmetic Operation");
        System.out.println("=============================\n");

        showMenu();

    }

    static void showMenu() {

        System.out.print("Enter first number: ");
        double numOne = input.nextDouble();

        System.out.print("\nEnter second number: ");
        double numTwo = input.nextDouble();

        add(numOne, numTwo);
        subtract(numOne, numTwo);
        multiply(numOne, numTwo);
        divide(numOne, numTwo);
        modulo(numOne, numTwo);       
        /*try {

          
            System.out.println("\nSelect Arithmetic Operation");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Modulo");

            try {
                System.out.print("\nEnter choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        add(numOne, numTwo);;
                        break;
                    case 2:
                        subtract(numOne, numTwo);
                        break;
                    case 3:
                        multiply(numOne, numTwo);
                        break;
                    case 4:
                        divide(numOne, numTwo);
                        break;
                    case 5:
                        modulo(numOne, numTwo);
                        break;
                    default:
                        System.out.println("Enter number from [1-5] only! ");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input!");
            }

        } catch (Exception e) {
            System.out.println("Enter number only! ");
        }*/
    }

    static void add(double numOne, double numTwo) {
        double result = numOne + numTwo;
        System.out.println((int)(numOne) + " + " + (int)(numTwo) + " = " + (int)(result));
    }

    static void subtract(double numOne, double numTwo) {
        double result = numOne - numTwo;
        System.out.println((int)(numOne) + " - " + (int)(numTwo) + " = " + (int)(result));
    }

    static void multiply(double numOne, double numTwo) {
        double result = numOne * numTwo;
        System.out.println((int)(numOne) + " x " + (int)(numTwo) + " = " + (int)(result));
    }

    static void divide(double numOne, double numTwo) {
        if (numTwo == 0) {
            System.out.println("Can't divide by 0");
        } else {
            double result = numOne / numTwo;    
            System.out.println((int)(numOne) + " / " + (int)(numTwo) + " = " + (int)(result));
        }
    }

    static void modulo(double numOne, double numTwo) {
        if (numTwo == 0) {
            System.out.println("Can't divide by 0");
        } else {
            double result = numOne % numTwo;
            System.out.println((int)(numOne) + " mod " + (int)(numTwo) + " = " + (int)(result));
        }
    }

    public static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

}
