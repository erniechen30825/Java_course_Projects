package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean asNextInt = scanner.hasNextInt();
        if(asNextInt){
            int yearOfBirth = scanner.nextInt();
            // using nextInt/double... to read a number, upon pressing enter after inputing the int, it will end the line of input,
            //ignoring those who come afterwards
            // therefore recommend to scan nextline again afterwards without assigning a variable
            scanner.nextLine();// handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }else{
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Unable to parse year of birth.");
        }


        //only close the scanner when you don't need it anymore
        scanner.close();
        //System.out -> output into console
        //System.in -> recieve input from console
        // new: used to create instance <- will discuss latter

        //Problems and solutions
        // 1. if we have negative input to year of birth -> will return wrong number
        // sol: check using if statement
        // 2. if we enter letters instead of numbers -> will raise error
        // sol: use scanner.hasNextInt() to check
    }
}
