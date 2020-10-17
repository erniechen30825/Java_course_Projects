package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printConversion(75.114);
    }
    // Write a method called to MilesPerHour with 1 parameter:kilometersPerHour
    //return rounded value of type long
    // if kilometersPerHour < 0, return -1
    // if positive, calculate the value of miles per hour, round it and return it
   public static  long toMilesPerHour (double kilometersPerHour){
        long miles;
        if (kilometersPerHour >= 0){
            miles = Math.round (kilometersPerHour / 1.609 );
        }else{
            miles = -1;
        }
        return miles;
    }
    // Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
    // This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
    // Then it needs to print a message in the format "XX km/h = YY mi/h".
    // XX represents the original value kilometersPerHour.
    // YY represents the rounded milesPerHour from the kilometersPerHour parameter.
    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour >= 0){
            long mileans = toMilesPerHour(kilometersPerHour);
            System.out.println (kilometersPerHour + " km/h = " + mileans + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }

    }


}
