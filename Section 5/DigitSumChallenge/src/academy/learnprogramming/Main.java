package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of the digits in number id " + sumDigits(125));
        System.out.println("The sum of the digits in number id " + sumDigits(-125));
        System.out.println("The sum of the digits in number id " + sumDigits(4));
        System.out.println("The sum of the digits in number id " + sumDigits(32123));
    }
    // Write method sumDigits that has one int parameter called number
    // if parameter is >= 10, return sum of all digits, otherwise return -1
    // The numbers from 0-9 have 1 digits so we don't want to process them,
    // also we don't want to process negative numbers,
    // so als return -1 for negative numbers
    // ex: sumDigits should return 8 (1 + 2 + 5 = 8)
    public static int sumDigits(int number){
            int total = 0;
            if(number < 10){
                return -1;
            }
            while(number > 0){
                int a = number % 10;
                total += a;
//                System.out.println("Current total: " + total);
                number /= 10;
//                System.out.println("Remaining number: " + number );
            }
            return total;
        }

    }


