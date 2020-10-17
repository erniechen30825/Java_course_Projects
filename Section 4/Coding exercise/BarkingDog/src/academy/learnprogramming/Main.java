package academy.learnprogramming;

public class Main {
    // Write a method shouldWakeUp that has 2 parameters.
    //
    //1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    //2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
    //
    //We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
    //
    //In all other cases return false.
    //
    //If the hourOfDay parameter is less than 0 or greater than 23 return false.
    public static void main(String[] args) {
        boolean a = shouldWakeUp(true,0);
        System.out.println(a);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wake;
        if (hourOfDay < 24 && hourOfDay >= 0){
            if (barking == true){
                if (hourOfDay < 8 | hourOfDay > 22){
                    wake = true;
                }else {
                    wake = false;
                }
            }else {
                wake = false;
            }
        }else {
            wake = false;
        }
        return  wake ;
    }
}
