/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tesda;

import java.util.Scanner;
/**
 *
 * @author danvicedaa
 * 
 * 1. load reference link: https://www.teknogadyet.com/2019/08/smart-prepaid-text-call-internet-promos.html
 * 
 */

public class Exercise5_Viceda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LOAD SERVICES =====");
        System.out.println("Dial *123# to access SMART Services");
        System.out.print("Enter USSD Code: ");

        String ussdCode = sc.nextLine();

        //sample 
        double loadBalance = 150.03d;

        if (!ussdCode.equals("*123#")) {
            System.out.println("========================================");
            System.out.println("Invalid USSD Code!");
            System.out.println("========================================");
            System.exit(0);
        }

        System.out.println("");
        System.out.println("===== SEND INSTRUCTION =====");
        System.out.println("Load Balance: ₱" + loadBalance);

        // main menu
        System.out.println("[1] GIGA VIDEO ");
        System.out.println("[2] GIGA VIDEO+ ");
        System.out.println("[3] GIGA ALL NET ");
        System.out.println("[4] GIGA IG+FB+TikTok ");
        System.out.println("[5] GIGA GAMES ");
        System.out.println("[6] Cancel ");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int confirm;
        System.out.println("");

        switch (choice) {

            // ===================== case 1 giga video =====================
            case 1:

                System.out.println("===== SELECT LOAD =====");
                System.out.println("[1] GIGA VIDEO 50");
                System.out.println("[2] GIGA VIDEO 99");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("");
                        System.out.println("===== Selected Load: GIGA VIDEO 50 =====");
                        System.out.println("Total Data: 4GB");
                        System.out.println("Validity: 3 days");
                        System.out.println("Price: ₱50");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 50) {
                                    loadBalance -= 50;

                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to GIGA VIDEO 50!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    case 2:

                        System.out.println("");
                        System.out.println("===== Selected Load: GIGA VIDEO 99 =====");
                        System.out.println("Total Data: 9GB");
                        System.out.println("Validity: 7 days");
                        System.out.println("Price: ₱99");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 99) {
                                    loadBalance -= 99;

                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to GIGA VIDEO 99!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    default:
                        System.out.println("");
                        System.out.println("========================================");
                        System.out.println("Invalid Number!");
                        System.out.println("========================================");
                }

                break;

            // ===================== case 2 giga video+ =====================
            case 2:

                System.out.println("===== SELECT LOAD =====");
                System.out.println("[1] GIGA VIDEO+ 50");
                System.out.println("[2] GIGA VIDEO+ 99");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.println("");
                        System.out.println("===== Selected Load: GIGA VIDEO+ 50 =====");
                        System.out.println("Total Data: 5GB video + 1GB open access");
                        System.out.println("Validity: 3 days");
                        System.out.println("Price: ₱50");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 50) {
                                    loadBalance -= 50;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to GIGA VIDEO+ 50!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    case 2:

                        System.out.println("");
                        System.out.println("===== Selected Load: GIGA VIDEO+ 99 =====");
                        System.out.println("Total Data: 10GB video + 2GB open access");
                        System.out.println("Validity: 7 days");
                        System.out.println("Price: ₱99");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 99) {
                                    loadBalance -= 99;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to GIGA VIDEO+ 99!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    default:
                        System.out.println("");
                        System.out.println("========================================");
                        System.out.println("Invalid Number!");
                        System.out.println("========================================");
                }

                break;

            // ===================== case 3 giga all net =====================
            case 3:

                System.out.println("===== SELECT LOAD =====");
                System.out.println("[1] ALL NET 50");
                System.out.println("[2] ALL NET 99");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.println("");
                        System.out.println("===== Selected Load: ALL NET 50 =====");
                        System.out.println("Total Data: 2GB of open-access data");
                        System.out.println("Validity: 3 days");
                        System.out.println("Price: ₱50");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 50) {
                                    loadBalance -= 50;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to ALL NET 50!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    case 2:

                        System.out.println("");
                        System.out.println("===== Selected Load: ALL NET 99 =====");
                        System.out.println("Total Data: 6GB of open-access data");
                        System.out.println("Validity: 3 days");
                        System.out.println("Price: ₱99");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 99) {
                                    loadBalance -= 99;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to ALL NET 99!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    default:
                        System.out.println("");
                        System.out.println("========================================");
                        System.out.println("Invalid Number!");
                        System.out.println("========================================");
                }

                break;

            // ===================== case 4 giga IG+FB+TikTok =====================
            case 4:

                System.out.println("===== SELECT LOAD =====");
                System.out.println("[1] SMART GIGA STORIES 50");
                System.out.println("[2] SMART GIGA STORIES 99");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.println("");
                        System.out.println("===== Selected Load: SMART GIGA STORIES 50 =====");
                        System.out.println("Total Data: 4GB");
                        System.out.println("Validity: 3 days");
                        System.out.println("Price: ₱50");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 50) {
                                    loadBalance -= 50;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to SMART GIGA STORIES 50!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    case 2:

                        System.out.println("");
                        System.out.println("===== Selected Load: SMART GIGA STORIES 99 =====");
                        System.out.println("Total Data: 9GB");
                        System.out.println("Validity: 7 days");
                        System.out.println("Price: ₱99");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 99) {
                                    loadBalance -= 99;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to SMART GIGA STORIES 99!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    default:
                        System.out.println("");
                        System.out.println("========================================");
                        System.out.println("Invalid Number!");
                        System.out.println("========================================");
                }

                break;

            // ===================== case 5 giga games =====================
            case 5:

                System.out.println("===== SELECT LOAD =====");
                System.out.println("[1] GIGA GAMES 50");
                System.out.println("[2] GIGA GAMES 99");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.println("");
                        System.out.println("===== Selected Load: GIGA GAMES 50 =====");
                        System.out.println("Total Data: 4GB for gaming apps");
                        System.out.println("Validity: 3 days");
                        System.out.println("Price: ₱50");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 50) {
                                    loadBalance -= 50;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to GIGA GAMES 50!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    case 2:

                        System.out.println("");
                        System.out.println("===== Selected Load: GIGA GAMES 99 =====");
                        System.out.println("Total Data: 9GB for gaming apps");
                        System.out.println("Validity: 7 days");
                        System.out.println("Price: ₱99");

                        System.out.println("");
                        System.out.println("[1] Buy Load");
                        System.out.println("[2] Cancel");

                        System.out.print("Confirm Choice: ");
                        confirm = sc.nextInt();

                        switch (confirm) {

                            case 1:
                                if (loadBalance >= 99) {
                                    loadBalance -= 99;
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("You are now subscribed to GIGA GAMES 99!");
                                    System.out.println("Remaining Balance: ₱" + loadBalance);
                                    System.out.println("========================================");
                                } else {
                                    System.out.println("");
                                    System.out.println("========================================");
                                    System.out.println("Insufficient Balance!");
                                    System.out.println("========================================");
                                }
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Transaction Cancelled.");
                                System.out.println("========================================");
                                break;

                            default:
                                System.out.println("");
                                System.out.println("========================================");
                                System.out.println("Invalid Choice!");
                                System.out.println("========================================");
                        }

                        break;

                    default:
                        System.out.println("");
                        System.out.println("========================================");
                        System.out.println("Invalid Number!");
                        System.out.println("========================================");
                }

                break;

            // ===================== CASE 6: CANCEL =====================
            case 6:
                System.out.println("");
                System.out.println("========================================");
                System.out.println("Transaction Cancelled.");
                System.out.println("========================================");
                break;

            default:
                System.out.println("");
                System.out.println("========================================");
                System.out.println("Invalid Number!");
                System.out.println("========================================");
        }

    }
}