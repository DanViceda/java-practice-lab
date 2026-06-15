
package tesda;

import java.util.Scanner;

public class Exercise3_Viceda {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        
        if (choice == 1){ // shows something on the line 13 with icon suggesting to use switch instead of if statement(ALT + ENTER)
            System.out.println("You selected Option 1: Start Game");
        }else if(choice == 2){
            System.out.println("You selected Option 2: Load Game");
        }else if (choice == 3){
            System.out.println("You selected Option 3: Settings");
        }else if (choice == 4){
            System.out.println("You selected Option 4: Exit");
        }else{
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
