//Import the Scanner tool so we can read what the user types
import java.util.Scanner;

public class ScannerObject {
    public static void main(String[] args)
    {
        //create a Scanner object that listens to the keyboard
        Scanner scanner = new Scanner(System.in);

        //ask the user for their name
        System.out.println("Enter your name: ");

        /* Wait for the user to type a full line and press Enter,
        then store what they typed in the variable 'name' */
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your GPA? ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();

        //print the input back to the user
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("With a GPA of: " + gpa);
        
        if (isStudent) {
            System.out.println("You are now enrolled");
        }
        else{
            System.out.println("Complete student registration");
        }
        //close the Scanner because we are done with the keyboard
        scanner.close();        
    }
}
/* NOTE:
    ~ If unexpected output is given when you input an integer followed by a string, 
    declare the scanner.nextLine(); method so that the input is stored in the correct variable
*/