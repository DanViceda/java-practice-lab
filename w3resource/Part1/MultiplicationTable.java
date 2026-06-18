package w3resource.Part1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Multiplication Table");
        System.out.println("=====================\n\n");

        try {
            System.out.print("Enter number: ");
            int number = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } catch (Exception e) {
            System.out.println("Enter number only! ");
        }

    }
}
