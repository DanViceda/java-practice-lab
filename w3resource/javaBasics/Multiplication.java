package w3resource.javaBasics;

import java.util.Scanner;

public class Multiplication {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===================");
        System.out.println("MULTIPLY TWO NUMBERS");
        System.out.println("===================");

        askProceed();

        while (true) {
            askNumber();
            askExit();
        }
    }

    static void askProceed() {

        while (true) {

            try {
                System.out.println("Do you want to use the application?");
                System.out.println("[1] Yes");
                System.out.println("[2] No");
                System.out.print("Enter Choice: ");

                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        clearScreen();
                        System.out.println("Opening the application...\n");
                        return;

                    case 2:
                        System.out.println("\nGoodbye!");
                        System.exit(0);

                    default:
                        clearScreen();
                        System.out.println("Invalid choice! Please enter 1 or 2 only.");
                        break;
                }

            } catch (Exception e) {
                clearScreen();
                System.out.println("Invalid input! Please enter a number.");
                input.nextLine();
            }
        }
    }

    static void askNumber() {

        System.out.print("Enter the first number: ");
        double numOne = input.nextDouble();

        System.out.print("Enter the second number: ");
        double numTwo = input.nextDouble();

        System.out.println("\nResult: " + numOne + " x " + numTwo + " = " + multiply(numOne, numTwo));
        System.out.println("");
    }

    static double multiply(double numOne, double numTwo) {
        // Multiply the two numbers and return the result
        return numOne * numTwo;
    }

    static void askExit() {

        while (true) {

            try {
                System.out.println("Do you want to continue?");
                System.out.println("[1] Yes");
                System.out.println("[2] No");
                System.out.print("Enter Choice: ");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        clearScreen();
                        System.out.println("Returning to the application...");
                        return;
                    case 2:
                        System.out.println("\nExiting the application. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please enter 1 or 2 only.");
                        break;
                }

            } catch (Exception e) {
                clearScreen();
                System.out.println("Invalid input! Please enter numbers only.");
                input.nextLine();
            }
        }
    }

    public static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}