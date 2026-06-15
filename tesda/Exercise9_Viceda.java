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
public class Exercise9_Viceda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("================================================");
        System.out.println("             AVERAGE CALCULATOR                 ");
        System.out.println("================================================\n");
        
        
        // SUBJECTS
        System.out.println("------------------------------------------------");
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt(); //how many subhects that user want
        input.nextLine(); // buffer
        
        String[] nameSubjects = new String[numSubjects]; // creates an array that can stores subjectName
        System.out.println("------------------------------------------------\n");
                             // 2 < 2
        for (int sub = 0; sub < nameSubjects.length; sub++) { // loop 
            System.out.print("Enter Subject " + (sub + 1) + ": ");
            nameSubjects[sub] = input.nextLine(); //stored the name subjects na here
        }
        System.out.println();
        
        
        // STUDENTS
        System.out.println("------------------------------------------------");
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt(); // how many students
        input.nextLine();
        
        
        String[] nameStudents = new String[numStudents];// creates an array that can stores student names
        
        int[][] grades = new int[numStudents][numSubjects];
        
        System.out.println("------------------------------------------------\n");
        
        for (int stu = 0; stu < nameStudents.length; stu++) {
            int total = 0;
            
            System.out.print("Name of the Student " + (stu + 1) + ": ");
            nameStudents[stu] = input.nextLine();
            
            System.out.println("\nEnter grades for each subject:");
            for (int grade = 0; grade < nameSubjects.length; grade++) {
                System.out.print(nameSubjects[grade] + ": ");
                grades[stu][grade] = input.nextInt();
                total += grades[stu][grade];
            }
            double average = (double) total / nameSubjects.length;
            System.out.println("________________");
            System.out.printf("Average: %.2f\n", average); // formatting + .2f(2 decimal with floating point)
            System.out.println("------------------------------------------------\n");
            input.nextLine(); // clear buffer
        }
        
        
        
        // REPORT
        System.out.println("================================================");
        System.out.println("             GRADES REPORT TABLE                ");
        System.out.println("================================================");
        
        
        // HEADER
        System.out.print("Student\t\t");
        for (int sub = 0; sub < nameSubjects.length; sub++) {
            System.out.print(nameSubjects[sub] + "\t");
        }
        
        System.out.println("Average");
        System.out.println("------------------------------------------------");
        // DATA ROWS
        
        for (int stu = 0; stu < nameStudents.length; stu++) {
            int total = 0;
            System.out.print(nameStudents[stu] + "\t\t");
            for (int grade = 0; grade < nameSubjects.length; grade++) {
                System.out.print(grades[stu][grade] + "\t");
                total += grades[stu][grade];
            }
            double average = (double) total / nameSubjects.length;
            System.out.printf("\t%.2f\n", average);
        }
        
    }
}