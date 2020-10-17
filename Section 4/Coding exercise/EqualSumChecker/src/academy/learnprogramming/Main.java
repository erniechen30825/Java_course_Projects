package academy.learnprogramming;

public class Main {
    //Write a method hasEqualSum with 3 parameters
    // of type int.
    //The method should return boolean
    // and it needs to return true
    // if the sum of the first and second parameter
    // is equal to the third parameter.
    // Otherwise, return false.

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasEqualSum( int num1 , int num2 , int num3 ){
        boolean result;
        int total = num1 + num2;
        if (total == num3){
            result =  true;
        }else{result = false ;}
        return result;
    }

}
