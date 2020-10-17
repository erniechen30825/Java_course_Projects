package academy.learnprogramming;

public class Main {
    //overloading
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(0, -1);
        if (centimeters < 0){
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(-99);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score *1000;
    }
    public static int calculateScore( int score){
        System.out.println("Unnamed player" +" scored " + score + " points");
        return score *1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player scored");
        return 0;
    }
    //challenge
    // method calcFeetAndInchesToCentimeters
    //two parameters
    //double feet >=0
    //double inches >=0 and <= 12
    //return -1 if either not true
    //then calculate how many centimeters comprise the feet and inches and return value
    //create 2nd method of the same name
    //but with only 1 param
    //validate that >=0
    //return -1 elsewise
    //if valid calc how many feet are in inches
    // call the other loaded method passing the correct feet and inches
    //calculated so that it can calculate correctly
    // hints: use double for your number datatypes
    //1 inch = 2.54cm
    //1 foot = 12 inches
    //
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0|(inches < 0| inches >12)){
            System.out.println("Invalid number");
            return -1;
        }else{
            double cent;
            cent = (inches * 2.54) + (feet*12*2.54);
            System.out.println(feet + " feet and " + inches + " inches is " + cent + " centimeters");
            return cent;
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }else{
            double feet = (int) (inches /12);
            double remaininginches = (int)inches % 12;
            double cent =calcFeetAndInchesToCentimeters(feet,remaininginches);
            System.out.println(inches + " inches is " + cent + " centimeters");
            return (cent);
        }

    }
}
