/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balex;

/**
 *
 * @author Earnest Bukenya
 */
import java.util.Scanner; // Import Scanner class to read user input as we have an input coming from the keyboard 
public class courses { // Define the class "courses"
    
    public static void main(String[] args) { // Declaring the main method 
        
// b) Identify and declare the variables in a program
        String courseId; //courseId is a combination of characters hence a string  
        String courseName = ""; //courseName is a combination of characters hence a string
        int tuition = 0; //tution is an integer 

        // Create a Scanner object to read input from the user and save the input 
        Scanner scanner = new Scanner(System.in);

        // Prompt the applicant to enter the CourseID
        System.out.print("Enter the CourseID: ");
        courseId = scanner.nextLine(); // Read the CourseID entered by the user

        // Check the CourseID and set course details accordingly
        switch (courseId.toUpperCase()) { //Here we start on the switch statement which is used one of the blocks depending on the input 
            case "BSE":
                courseName = "Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                courseName = "Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                courseName = "Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                courseName = "Computer Engineering";
                tuition = 950000;
                break;
            default:
                System.out.println("Wrong CourseID details"); //if none of the above cases was entered by the user then
                return; // Exit the program outputting Wrong CourseID details as stated in the line above 
        }

        // Display the course details depending on which courseId was entered
        System.out.println("Course Name: " + courseName);
        System.out.println("Tuition Fee: " + tuition);
    }
}

   
