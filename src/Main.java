// importing the scanner which gathers feedback from the user
import java.util.Scanner;


//
public class Main {
    public static void main(String[] args){
// creating a new scanner class telling it to read input from the keyboard
        Scanner scanner = new Scanner (System.in);

        // asking for the name
        System.out.println("Enter your Name: ");
        // reads the entire line of input from the suer and stores it in the name var
        // scanner.nextLine() reads a full line of text as a string
        String name = scanner.nextLine();

        System.out.print("Enter your job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter your contact info: ");
        String contactInfo = scanner.nextLine();

        // formatting the output
        System.out.println("Name Badge");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Contact: " + contactInfo);

        scanner.close();
    }
}