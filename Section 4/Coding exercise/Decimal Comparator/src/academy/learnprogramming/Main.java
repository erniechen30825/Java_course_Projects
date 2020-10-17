package academy.learnprogramming;

import java.text.DecimalFormat;

public class Main {
    //Write a method areEqualByThreeDecimalPlaces
    // with two parameters of type double.
    //The method should return boolean and it needs to return true
    // if two double numbers are the same up to three decimal places.
    // Otherwise, return false.
    public static void main(String[] args) {
	boolean ans = areEqualByThreeDecimalPlaces(-3.123,3.123);
	System.out.println(ans);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        int new1 = (int)(num1 * 1000);
        int new2 = (int)(num2 * 1000);
        boolean result ;
        System.out.println(new1);
        System.out.println(new2);
        if (new1 == new2){
            result = true;
        }else {result = false ; }
        return  result;


    }
}
