package academy.learnprogramming;

public class Main {
    //Write a method named hasTeen with 3 parameters of type int.
    //The method should return boolean
    // and it needs to return true
    // if one of the parameters is in range
    // 13(inclusive) - 19 (inclusive).
    // Otherwise return false.
    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        boolean result;
        if (num1 <= 19 & num1 >= 13){
            result = true;
        }else if (num2 <= 19 & num2 >= 13){
            result = true;
        }else if (num3 <= 19 & num3 >= 13){
            result = true;
        }else{result = false;}
        return result;
    }
    //Write another method named isTeen
    // with 1 parameter of type int.
    //The method should return boolean
    // and it needs to return true
    // if the parameter is in range
    // 13(inclusive) - 19 (inclusive).
    // Otherwise return false.
    public static boolean isTeen(int num){
        boolean result;
        if (num <= 19 & num >= 13){
            result = true;
        }else {result = false;}
        return result;
    }
}
