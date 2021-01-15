package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Read 10 numbers from the console entered by the user and print
        // the sum of those numbers
        // Create a Scanner
        // Use hasNextInt() method
        // if hasNextInt() returns false, print message "Invalid Number"
        // Continue reading until you have read 10 numbers
        // Use nextInt() method to get the number and add it to the sum
        // Before  the user enters each number,
        // print the message "Enter number #x:"
        // x represents the count 1,2,3,4...
        // Hint: use a while loop
        // Use a counter variable for counting valid numbers
        // Close the scanner after you don't need it anymore

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(count < 10){
            count ++;
            System.out.println("Enter number #" + count + ":");
            boolean asNextInt = scanner.hasNextInt();
            if(!asNextInt){
            System.out.println("Invalid Number");
            }else{
                int num = scanner.nextInt();
                sum += num;
                }
            scanner.nextLine();
            }
        scanner.close();
        System.out.println("The total sum : " + sum);
        }




}

