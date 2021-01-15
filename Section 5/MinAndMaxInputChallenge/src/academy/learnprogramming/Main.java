package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int max = 0;
        int min = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number : ");
            boolean IsInt = scanner.hasNextInt();
            if(IsInt){
                int num = scanner.nextInt();
                if (first){
                    max = num;
                    min = num;
                    first = false;
                }else{
                    if (num > max){
                        max = num;
                    }else if (num < min){
                        min = num;
                    }
                }


            }else{
                System.out.println("Max number is " + max);
                System.out.println("Min number is " + min);
                break;
            }
        }
    }
}
