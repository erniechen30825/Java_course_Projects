package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);
        int first = 1500;
        int sec = 900;
        int third = 400;
        int forth = 50;
        displayHighScorePosition("Alex",calculateHighScorePosition(first));
        displayHighScorePosition("Bob",calculateHighScorePosition(sec));
        displayHighScorePosition("Casper",calculateHighScorePosition(third));
        displayHighScorePosition("Dan",calculateHighScorePosition(forth));

    }
    //void means not returning any values
    //
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver ){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return - 1;
        //conventionally -1 means error
    }

    //challenge
    //1.create method displayHighScorePosition
    //Input: name , position in  high score table
    //Output: print name + managed to get + position + on high score table
    //2. create method calculateHighScorePosition
    // Input : score
    // Output: position
    // citeria : >1000 : 1, >500 and <= 1000:2, >100 and <500:3, <100:4
    // call both methods and display results of score 1500,900,400,50
//Second time
    public static void displayHighScorePosition(String name,int position){
        System.out.println(name + "managed to get position " + position + " on high score table");
    }
    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if (score >= 500 ){
            return 2;
        }else if(score >= 100 ){
            return 3;
        }else return  4;
    }



//First Try
//    public static void displayHighScorePosition( String name, int position){
//        System.out.println( name + " managed to get position " + position + " on the high score table.");
//    }
//    // void method also called procedures
// ALternative way with only one return value
//    public static int calculateHighScorePosition( int score){
//        int position = 4;
//        if (score >= 1000) {
//            position = 1;
//        }else if(score >= 500){
//            position = 2;
//        }else if (score >= 100){
//            position = 3;
//        }
//        return  position;
//        }


        //if (score >= 1000){
        //    return 1;
        //}else if(score >= 500 ){
        //    return 2;
        //}else if(score >= 100 ){
        //    return 3;
        //}
        //return 4;
    }



